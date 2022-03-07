package com.threads.demo;

import java.util.Scanner;
import java.util.concurrent.Semaphore;

public class PrimeNumbersWithSemaphore {
    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Runnable runnable = () -> {
                try {
                    semaphore.acquire();
                    int number = PrimeNumber.calculate(n);
                    System.out.println("Value of " + n + " th prime is " + number);
                } catch (InterruptedException ex) {
                    System.out.println(ex);
                } finally {
                    semaphore.release();
                }
            };
            Thread thread = new Thread(runnable);
            thread.start();
        }
    }
}
