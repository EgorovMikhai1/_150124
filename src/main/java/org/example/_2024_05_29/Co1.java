package org.example._2024_05_29;

import java.util.*;
import java.util.stream.Collectors;

public class Co1 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AWE", "CER", "SDF", "ZXC", "AAA");

//        Set<String> set = list.stream().collect(Collectors.toSet());
//        List<String> set1 = list.stream().collect(Collectors.toList());
//        Map<Integer, String> map1 = list.stream().collect(Collectors.toMap(String::length, el -> el));
//        Map<String, String> map2 = list.stream().collect(Collectors.toMap(k -> k + "!", el -> el + "*", (k, v) -> k + ",," +  v));
//        Map<String, String> map2 = list.stream().collect(Collectors.toMap(k -> k + "!", el -> el + "*", (k, v) -> k + ",," +  v, TreeMap::new));
//        Long l = list.stream().collect(Collectors.counting());
//        Long l = list.stream().collect(Collectors.counting());
        String s = list.stream().collect(Collectors.joining("*"));

        System.out.println(s);

    }
}
