package org.example._2024_06_10;

import java.util.HashMap;
import java.util.Map;

public class ServiceMap {
    private Map<String, Integer> dataMap = new HashMap<>();

    public void update(String key, int value) {
        if(dataMap.containsKey(key)) {
            dataMap.put(key, dataMap.get(key) + value);
        } else {
            dataMap.put(key, value);
        }
    }

    public Map<String, Integer> getDataMap() {
        return dataMap;
    }
}
