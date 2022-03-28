package com.demo.list;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> names = new LinkedList<>();
        names.add("Name B");
        names.add("Name A");
        names.add("Name B");

        System.out.println(names);

        names.add(null);
        names.add(null);

        System.out.println(names);
        System.out.println(names.size());
    }
}
