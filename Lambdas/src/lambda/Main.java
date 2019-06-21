package lambda;

public class Main {
    static int i = 1;
    public static void main(String[] args) {
        int i = 2;

        User user = new User() {
            @Override
            public void print() {
                int i = 3;
                System.out.println(i);
            }
        };

        user.print();

        User user1 = () -> {
//            i = 4;
            System.out.println(i);
        };

        user1.print();

//        System.out.println(i);
    }
}

@FunctionalInterface
interface User {
    void print();
}
