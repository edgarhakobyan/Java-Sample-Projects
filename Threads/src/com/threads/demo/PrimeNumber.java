package com.threads.demo;

public class PrimeNumber {
    public static int calculate(int n) {
        int primeNumber = 2;
        int count = 1;

        while (count != n) {
            ++primeNumber;
            if (isPrime(primeNumber)) {
                ++count;
            }
        }

        return primeNumber;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i <= n / 2; ++i) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
