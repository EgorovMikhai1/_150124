package org.example._2024_05_24;

import java.util.Arrays;
import java.util.List;

public class StreamF {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "B", "C");

        List<String> x = list.parallelStream()
                .map(el -> {
                    if ("A".equals(el)) {
                        System.out.println(el);
                    }
                    return el;
                }).toList();
    }
}