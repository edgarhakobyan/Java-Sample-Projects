package com.demo.list;


import java.util.*;

public class ListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("hello");
        arrayList.add("world");
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        List<String> linkedList = new LinkedList<>();
        linkedList.add("hi");
        linkedList.add("tester");
        linkedList.remove("hi");
        System.out.println(linkedList);

        List<String> vector = new Vector<>();
        vector.add("hi");
        vector.add("test");
        System.out.println(vector.get(1));

        Stack<String> stack = new Stack<>();
        stack.add("test");
        stack.add("test2");
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }
}
