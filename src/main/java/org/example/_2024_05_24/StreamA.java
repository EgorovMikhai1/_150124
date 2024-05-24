package org.example._2024_05_24;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamA {
    public static void main(String[] args) {
        /**
         * groupingBy()
         */

        List<String> list = Arrays.asList("QWE", "GERT", "QUIOP", "GHJH", "LJH", "LL");

        Map<Character, List<String>> map =
                list.stream()
                        .collect(Collectors.groupingBy(word -> word.charAt(0)));

        System.out.println(map);

    }
}
