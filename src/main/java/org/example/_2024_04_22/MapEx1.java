package org.example._2024_04_22;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapEx1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new LinkedHashMap<>();
        map.put(10, "Mik");
        map.put(4, "Nik");
        map.put(1, "LL");
        map.put(2, "QQ");
        map.put(5, "Nik");
        map.put(9, "EE");
        map.put(3, "WDF");
        map.put(8, "Nik");
        map.put(7, "RTG");
        map.put(6, "CCV");
        map.put(6, "MMMMMMMMM");


        for (Map.Entry<Integer, String> i : map.entrySet()) {
            System.out.println(i);
        }





//        System.out.println(map);
//
//        System.out.println("GET: " + map.get(8));
//        System.out.println("REMOVE: " + map.remove(6));


    }
}
