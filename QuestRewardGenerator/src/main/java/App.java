import java.util.List;
import java.util.Random;

public class App {
    public static void main(String[] args) {
        int N = 100;
        String rewardString = generateQuestRewards(N);
        System.out.println(rewardString);

//        bbbbbbbbbbbbbbbbbbbbssbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbbssssssssssssssssssssssssssssssssssssbssssss
//

//        bbbbbbbbbsbbbbbbbbsbbbsbbbsbbbbsbsbbsbsbbsbbsbsbsbsbssbsbsbsbsbsssbsssbssbssbsssssbssssssbssssssssss

        /*
        *
        * bbbbbbbbb
        * s
        * bbbbbbbb
        * s
        * bbb
        * s
        * bbb
        * s
        * bbbb
        * s
        * b
        * s
        * bb
        * s
        * b
        * s
        * bb
        * s
        * bb
        * s
        * b
        * s
        * b
        * s
        * b
        * s
        * b
        * ss
        * b
        * s
        * b
        * s
        * b
        * s
        * b
        * s
        * b
        * sss
        * b
        * sss
        * b
        * ss
        * b
        * ss
        * b
        * sssss
        * b
        * ssssss
        * b
        * ssssssssss
        *
        *
        * */
    }

    public static String generateQuestRewards(int N) {
        StringBuilder rewards = new StringBuilder();

        for (int i = 0; i < N; i++) {
            double probabilityOfBronze = calculateBronzeProbability(i, N);
            double pseudoRandomValue = deterministicRandom(i, N);

            if (probabilityOfBronze >= pseudoRandomValue) {
                rewards.append('b');
            } else {
                rewards.append('s');
            }
        }

        return rewards.toString();
    }

//    bbbbbbbbbbbbbbbbbssbbbssbsbsbsbssbbbssbbbsbsbbsssssssbsssbssssbsssssssssbssssbssssbsssssssssssssssss
//    bbbbbbbbbbbbbbbbbssbbbssbsbsbsbssbbbssbbbsbsbbsssssssbsssbssssbsssssssssbssssbssssbsssssssssssssssss

    private static double calculateBronzeProbability(int index, int total) {
        // Using a polynomial function to calculate the probability of a bronze chest
        double x = (double) index / total;

        // Adjusted polynomial function to better fit the given example pattern
//        double probability = Math.pow(1 - x, 2.5) * (1 - 0.2 * Math.sin(3 * Math.PI * x));


        return Math.pow(1 - x, 1.5) * (1 - 0.1 * Math.sin(3 * Math.PI * x));
    }

    private static double deterministicRandom(int index, int total) {
        // A simple deterministic function to simulate pseudo-randomness
        // This function uses a mix of arithmetic operations to generate a value between 0 and 1
        long value = (long) index * 6364136223846793005L + total * 1442695040888963407L;
        value = (value ^ (value >> 21)) ^ (value << 35) ^ (value >> 4);
        value = value * 2685821657736338717L;
        return (double) (value & 0xFFFFFFFFL) / 0x100000000L;
    }



//    public static String generateQuestRewards(int N) {
//        StringBuilder rewards = new StringBuilder(N);
//
//        for (int i = 0; i < N; i++) {
//            // Calculate the probability of getting a "b" based on the position
//            // Using a logistic function for smoother transition
//            double probabilityB = 1 / (1 + Math.exp((double)(i - N / 2) / (N / 10)));
//
//            // Determine reward based on the probability and deterministic pseudo-random sequence
//            if (probabilityB > deterministicRandom(i, N)) {
//                rewards.append('b');
//            } else {
//                rewards.append('s');
//            }
//        }
//
//        return rewards.toString();
//    }
//
//    // A simple LCG to simulate pseudo-randomness deterministically
//    private static double deterministicRandom(int seed, int N) {
//        long a = 1664525;
//        long c = 1013904223;
//        long m = (long) Math.pow(2, 32);
//        long x = seed;
//
//        for (int i = 0; i < N; i++) {
//            x = (a * x + c) % m;
//        }
//
//        return (x / (double) m);
//    }



//    public static String generateQuestRewards(int N) {
//        StringBuilder rewards = new StringBuilder(N);
//
//        for (int i = 0; i < N; i++) {
//            // Calculate the probability of getting a "b" using a sine function
//            double probabilityB = 0.5 * (1 + Math.cos(Math.PI * i / N));
//
//            // Determine reward based on the probability and a deterministic sequence
//            if (probabilityB > deterministicSequence(i, N)) {
//                rewards.append('b');
//            } else {
//                rewards.append('s');
//            }
//        }
//
//        return rewards.toString();
//    }
//
//    // A simple deterministic function to simulate pseudo-randomness
//    private static double deterministicSequence(int i, int N) {
//        // Using a simple hash-like deterministic function
//        long hash = 31 * i + 7 * N;
//        hash = (hash ^ (hash >> 16)) & 0xFFFFFFFFL;
//        return (hash % 10000) / 10000.0;
//    }



//    public static String generateQuestRewards(int N) {
//        StringBuilder rewards = new StringBuilder(N);
//
//        for (int i = 0; i < N; i++) {
//            // Calculate the probability of getting a "b" using a polynomial function
//            double t = (double) i / N;
//            double probabilityB = (1 - t) * (1 - t);
//
//            // Determine reward based on the probability and a deterministic sequence
//            if (probabilityB > deterministicSequence(i, N)) {
//                rewards.append('b');
//            } else {
//                rewards.append('s');
//            }
//        }
//
//        return rewards.toString();
//    }
//
//    // A simple deterministic function to simulate pseudo-randomness
//    private static double deterministicSequence(int i, int N) {
//        // Using a simple hash-like deterministic function
//        long hash = 31 * i + 7 * N;
//        hash = (hash ^ (hash >> 16)) & 0xFFFFFFFFL;
//        return (hash % 10000) / 10000.0;
//    }




//    public static String generateQuestRewards(int N) {
//        StringBuilder rewards = new StringBuilder(N);
//
//        for (int i = 0; i < N; i++) {
//            // Calculate the probability of getting a "b" using a sine function
//            double t = (double) i / (N - 1);
//            double probabilityB = 0.5 * (1 + Math.cos(Math.PI * t));
//
//            // Use a deterministic pseudo-random sequence
//            double pseudoRandomValue = deterministicSequence(i, N);
//
//            // Determine reward based on the probability
//            if (pseudoRandomValue < probabilityB) {
//                rewards.append('b');
//            } else {
//                rewards.append('s');
//            }
//        }
//
//        return rewards.toString();
//    }
//
//    // A simple deterministic function to simulate pseudo-randomness
//    private static double deterministicSequence(int i, int N) {
//        long seed = (31L * i + 7L * N) & 0xFFFFFFFFL;
//        seed = (seed ^ (seed >> 16)) & 0xFFFFFFFFL;
//        return (seed % 10000) / 10000.0;
//    }
}
