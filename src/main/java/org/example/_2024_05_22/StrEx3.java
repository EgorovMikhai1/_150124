package org.example._2024_05_22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StrEx3 {
    public static void main(String[] args) {
        Stream<Integer> stream = Stream.of(1,2,3,4);

//        stream.forEach(System.out::println);
//        stream.forEach(System.out::println);

        List<Integer> list = Arrays.asList(1, 2, 3, 4);

        list.stream()
                .reduce(1000, (acc, com) -> acc + com);
    }
}
