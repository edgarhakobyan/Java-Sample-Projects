package com.threads.demo;

import java.util.Scanner;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PrimeNumbersWithLock {
    public static void main(String[] args) {
        Lock lock = new ReentrantLock();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Runnable runnable = () -> {
                lock.lock();
                int number = PrimeNumber.calculate(n);
                System.out.println("Value of " + n + " th prime is " + number);
                lock.unlock();
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
