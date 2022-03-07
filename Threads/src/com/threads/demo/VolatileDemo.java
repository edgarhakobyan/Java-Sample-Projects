package com.threads.demo;

public class VolatileDemo {
    private volatile static int number;
    private volatile static boolean isReady;

    private static class Reader extends Thread {
        @Override
        public void run() {
            while (!isReady) {
                System.out.println("yield");
                Thread.yield();
            }

            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        new Reader().start();

        number = 42;
        isReady = true;
    }
}
