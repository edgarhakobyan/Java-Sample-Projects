package com.demo.queue;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {
    public static void main(String[] args) {
        Queue<String> priorityQueue = new PriorityQueue<>();
        priorityQueue.add("hi");
        priorityQueue.add("test");
        priorityQueue.add("test1");
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.peek());

        Deque<String> deque = new ArrayDeque<>();
        deque.add("hi");
        deque.add("test");
        System.out.println(deque.removeLast());
        System.out.println(deque.peekFirst());
    }
}
