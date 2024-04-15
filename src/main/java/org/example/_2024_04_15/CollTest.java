package org.example._2024_04_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CollTest {
    public static void main(String[] args) {
        int cap = 1_000_000;
        List<Integer> integers = new LinkedList<>();
        for (int i = 0; i < cap; i++) {
            integers.add(111);
        }

        long startTime = System.currentTimeMillis();
        for (int i = 0; i < 10_000; i++) {
            integers.add(cap/3, 999);
        }
        long endTime = System.currentTimeMillis();

        System.out.println("TIME: " + (endTime - startTime));
    }
}
