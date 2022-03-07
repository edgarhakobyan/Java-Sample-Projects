package com.threads.demo;

import java.util.Scanner;
import java.util.concurrent.CompletableFuture;

public class PrimeNumbersWithCompletableFuture {
    public static void main(String[] args) {
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            CompletableFuture.supplyAsync(() -> PrimeNumber.calculate(n))
                    .thenAccept((result) -> System.out.println(n + "th prime number is " + result));
        }
    }
}
