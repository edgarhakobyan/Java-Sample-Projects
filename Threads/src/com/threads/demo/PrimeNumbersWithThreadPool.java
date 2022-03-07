package com.threads.demo;

import java.util.Scanner;
import java.util.concurrent.*;

public class PrimeNumbersWithThreadPool {
    public static void main(String[] args) {
//        final ExecutorService executorService = Executors.newFixedThreadPool(3);
        ThreadPoolExecutor executorService = (ThreadPoolExecutor) Executors.newFixedThreadPool(3);

        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
        Runnable reporter = () -> {
            System.out.println("Running reporter");
            System.out.println("Active thread " + executorService.getActiveCount());
            System.out.println("Completed thread " + executorService.getCompletedTaskCount());
        };
//        scheduledExecutorService.schedule(reporter, 5, TimeUnit.SECONDS);
        scheduledExecutorService.scheduleAtFixedRate(reporter, 1, 5, TimeUnit.SECONDS);

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                break;
            }
            Runnable r = () -> {
                int number = PrimeNumber.calculate(n);
                System.out.println("Thread name " + Thread.currentThread().getName());
                System.out.println("Value of " + n + "th prime is " + number);
            };
            executorService.execute(r);
        }
    }
}
