package org.example._2024_05_01;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Holiday {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("January", 1);
        map.put("February", 2);
        map.put("March", 3);
        map.put("April", 4);

        System.out.println(map);

        Map<String, Integer> map2 = new LinkedHashMap<>();

        map2.put("March", 3);
        map2.put("April", 4);
        map2.put("January", 1);
        map2.put("February", 2);

        System.out.println(map2);
    }
}
