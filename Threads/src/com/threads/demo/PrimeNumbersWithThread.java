package com.threads.demo;

import java.util.Scanner;

public class PrimeNumbersWithThread {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Runnable r = () -> {
                int number = PrimeNumber.calculate(n);
                System.out.println("Value of " + n + " th prime is " + number);
            };
            Thread thread = new Thread(r);
//            thread.setDaemon(true);
            thread.start();
        }
    }
}
