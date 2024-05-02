package org.example._2024_05_02;

import java.util.ArrayDeque;
import java.util.Deque;

public class ADQ {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();

        deque.add(55);
        deque.add(55);
        deque.add(2);
        deque.add(55);
        deque.add(55);
        deque.add(2);
        deque.add(55);
        deque.add(55);

        System.out.println(deque);
        System.out.println(deque.removeFirstOccurrence(2));
        System.out.println(deque);
        System.out.println(deque.removeFirstOccurrence(2));
        System.out.println(deque);

    }
}