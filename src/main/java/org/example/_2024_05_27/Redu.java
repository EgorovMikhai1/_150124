package org.example._2024_05_27;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Redu {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("mama", "myla", "ramu");

        Set<Character> identity = new HashSet<>();

        BiFunction<Set<Character>, String, Set<Character>> accumulator =
                (seT, str) -> {
                    for (char c : str.toCharArray()) {
                        seT.add(c);
                    }
                    return seT;
                };

        BinaryOperator<Set<Character>> combiner =
                (set1, set2) -> {
                    set1.addAll(set2);
                    return set1;
                };

        Set<Character> unique = list.stream()
                .reduce(identity, accumulator, combiner);

        String res = unique.stream()
                .map(String::valueOf)
                .collect(Collectors.joining());

        System.out.println(res);
    }
}
