package org.example._2024_05_22;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Reducer {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4);
        List<String> list1 = Arrays.asList("a", "b", "c");

//        int sum = list.stream()
//                .reduce(0, (acc, el) -> acc + el);

        int sum = list.stream()
                .reduce(1, (acc, el) -> acc * el);

        String con = list1
                .stream().reduce("", (acc, el) -> acc + el);

        Optional<Integer> max = list.stream()
                .reduce((acc, el) -> Exxxx.printList(acc, el));
    }
}

class Exxxx {
    public static int printList(int a, int b) {
        return a + b;
    }
}