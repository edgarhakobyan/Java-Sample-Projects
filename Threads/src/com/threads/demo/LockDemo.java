package com.threads.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockDemo {
    public static void main(String[] args) {
        CounterLock counter = new CounterLock();
        new Thread(counter, "one").start();
        new Thread(counter, "two").start();
        new Thread(counter, "three").start();
        new Thread(counter, "four").start();

        CounterLock counter2 = new CounterLock();
        new Thread(counter2, "Counter 2").start();
    }
}

class CounterLock implements Runnable {
    private int count = 0;
    private Lock l = new ReentrantLock();

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
        l.lock();
        try {
            this.increment();
            System.out.println(Thread.currentThread().getName() + " increments - " + this.getCount());
            this.decrement();
            System.out.println(Thread.currentThread().getName() + " decrement - " + this.getCount());
        } finally {
            l.unlock();
        }
    }
}