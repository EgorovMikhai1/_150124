package org.example._2024_05_23;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Cl2 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("QWER", "TYUI");

        list.stream()
                .flatMap(element -> Arrays.stream(element.split(""))).toList();

        List<List<Integer>> listList = Arrays.asList(
                Arrays.asList(1, 2),
                Arrays.asList(3, 4),
                Arrays.asList(5, 6),
                Arrays.asList(7, 8),
                Arrays.asList(9, 10)
        );

        listList.stream()
                .flatMap(Collection::stream)
                .filter(el -> el > 5)
                .forEach(System.out::println);
    }
}

