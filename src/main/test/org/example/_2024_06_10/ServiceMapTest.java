package org.example._2024_06_10;

import org.junit.jupiter.api.Test;

import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ServiceMapTest {
    private static final ServiceMap SERVICE_MAP = new ServiceMap();

    @Test
    void updateNewKeyTest() {
        String key = "key";
        int value = 10;

        SERVICE_MAP.update(key, value);

        Map<String, Integer> dataMap = SERVICE_MAP.getDataMap();

        assertTrue(dataMap.containsKey(key));
        assertEquals(1, dataMap.size());
    }
}