package com.demo.list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name A");
        names.add("Name B");
        names.add("Name B");
        System.out.println(names);

        names.set(1, "Name C");
        System.out.println(names);

        names.add(1, "Name D");
        System.out.println(names);

        names.sort(null);
        System.out.println(names);

        System.out.println(names.get(3));

        System.out.println(names.size());
    }
}
