package org.example._2024_04_29;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIex {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        ListIterator<String> forwardIterator = list.listIterator();
        ListIterator<String> backIterator = list.listIterator(list.size());

        while (backIterator.hasPrevious()) {
            System.out.println(backIterator.previous());
        }

        System.out.println("1");
    }
}
