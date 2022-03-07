package com.threads.demo;

public class SynchronizedDemo {
    public static void main(String[] args) {
        Counter counter = new Counter();
        new Thread(counter, "one").start();
        new Thread(counter, "two").start();
        new Thread(counter, "three").start();
        new Thread(counter, "four").start();

        Counter counter2 = new Counter();
        new Thread(counter2, "Counter 2").start();
    }
}

class Counter implements Runnable {
    private int count = 0;

    public void increment() {
        ++count;
    }

    public void decrement() {
        --count;
    }

    public int getCount() {
        return count;
    }

    @Override
    public void run() {
        synchronized (this) {
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments - " + this.getCount());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrement - " + this.getCount());
        }
    }
}
