package com.threads.demo;

import java.util.concurrent.RecursiveTask;

public class CalculatePrimeTask extends RecursiveTask<Integer> {
    private int[] array;
    private int start;
    private int end;

    public CalculatePrimeTask(int[] array, int start, int end) {
        this.array = array;
        this.start = start;
        this.end = end;
    }

    @Override
    protected Integer compute() {
        if (start == end) {
            return PrimeNumber.calculate(array[start]);
        }
        int mid = (start + end) / 2;
        CalculatePrimeTask subTask1 = new CalculatePrimeTask(array, start, mid);
        CalculatePrimeTask subTask2 = new CalculatePrimeTask(array, mid + 1, end);
        invokeAll(subTask1, subTask2);
        return subTask1.join() + subTask2.join();
    }
}
