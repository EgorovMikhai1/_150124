package org.example._2024_05_21;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

//        Arrays.stream(array)

        List<Integer> list =
                Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

//        list.stream()

//        long l = Arrays.stream(array)
//                .count();
//        System.out.println(l);

        list.stream()
                .map(param -> param * 10)
                .filter(el -> el < 55)
//                .forEach(Saver::saveData);
                .skip(3)
                .forEach(System.out::println);

        Stream<Integer> stream = Stream.of(1,2,3,4,5,6,7,8,9);


    }
}

class Saver {
    public static void saveData(int digit) {

    }
}