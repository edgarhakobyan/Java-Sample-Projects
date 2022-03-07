package com.threads.demo;

import java.util.concurrent.ForkJoinPool;

public class PrimeNumbersWithForkJoin {
    public static void main(String[] args) {
        int array[] = {2, 3, 4, 5, 6, 7, 8, 9};
        ForkJoinPool forkJoinPool = ForkJoinPool.commonPool();
        CalculatePrimeTask primeTask = new CalculatePrimeTask(array, 0, array.length - 1);
        Integer result = forkJoinPool.invoke(primeTask);
        System.out.println("The sum of primes is " + result);
    }
}
