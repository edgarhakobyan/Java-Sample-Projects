package com.demo.map;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, Integer> mapDemo = new HashMap<>();
        mapDemo.put("test1", 2);
        mapDemo.put("test2", 4);
        mapDemo.put("test3", 3);

        for (Map.Entry<String, Integer> map : mapDemo.entrySet()) {
            System.out.println(map.getKey());
            System.out.println(map.getValue());
        }

        mapDemo.putIfAbsent("test2", 7);
        mapDemo.computeIfAbsent("test4", key -> 7);

        System.out.println(mapDemo);
    }
}
