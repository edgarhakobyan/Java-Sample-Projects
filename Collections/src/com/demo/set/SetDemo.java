package com.demo.set;

import java.util.*;

public class SetDemo {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("Name B");
        hashSet.add("Name A");
        hashSet.add("Name C");
        hashSet.add("Name D");
        System.out.println(hashSet);
        System.out.println(hashSet.size());
        Iterator itr = hashSet.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        System.out.println("================");

        Set<String> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add("Name B");
        linkedHashSet.add("Name A");
        linkedHashSet.add("Name C");
        linkedHashSet.add("Name D");
        Iterator itr1 = linkedHashSet.iterator();
        while(itr1.hasNext()) {
            System.out.println(itr1.next());
        }

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("tttt");
        treeSet.add("ffff");
        Iterator itr2 = treeSet.iterator();
        while(itr2.hasNext()) {
            System.out.println(itr2.next());
        }
    }
}
