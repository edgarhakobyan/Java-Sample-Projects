package com.threads.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.concurrent.*;

public class PrimeNumbersWithCallable {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newCachedThreadPool();
        List<Future<Integer>> futureResults = new ArrayList<>();

        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter n: ");
            int n = scanner.nextInt();
            if (n == 0) {
                executorService.shutdown();
                break;
            }

            Callable<Integer> callable = () -> PrimeNumber.calculate(n);
            Future<Integer> future = executorService.submit(callable);
            futureResults.add(future);

            Iterator<Future<Integer>> iterator = futureResults.iterator();
            while (iterator.hasNext()) {
                Future<Integer> f = iterator.next();
                if (f.isDone()) {
                    System.out.println("Prime number is " + f.get());
                    iterator.remove();
                }
            }
        }
        System.out.println("finish");
    }
}
