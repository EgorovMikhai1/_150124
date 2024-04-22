package org.example._2024_04_22;

import java.util.HashMap;
import java.util.Map;

public class MapEx2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "a");
        map.put(null, "b");

        for (String keys : map.keySet()) {
            if("A".equals(keys)) {
                System.out.println("!!!!");
            }
        }
    }
}
