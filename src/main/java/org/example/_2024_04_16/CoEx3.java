package org.example._2024_04_16;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CoEx3 {
    public static void main(String[] args) {
        List<String> list = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        list.remove("2");
//        list.set(0, "Q");

        List<String> list1 = Arrays.asList("1", "2", "3", "4", "5", "6", "7", "8", "9");
//        list1.remove("2");
        list1.set(0, "P");

    }
}
