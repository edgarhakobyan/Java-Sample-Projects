package com.threads.demo;

import java.util.concurrent.*;

public class CallableDemo {
    public static void main(String[] args) {
//        Runnable r = () -> {
//            System.out.println("Call from runnable");
//        };
//        ExecutorService serviceRunnable = Executors.newSingleThreadExecutor();
//        serviceRunnable.execute(r);

        Callable<String> c = () -> {
            System.out.println("Call from callable");
            Thread.sleep(3000);
            return "Value form callable";
        };

        ExecutorService serviceCallable = Executors.newSingleThreadExecutor();
        Future<String> stringFuture = serviceCallable.submit(c);
        System.out.println("Running main thread before callable");
        try {
            String res = stringFuture.get();
            System.out.println("res = " + res);
        } catch (InterruptedException | ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("Running main thread after callable");
    }
}
