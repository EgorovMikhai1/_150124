package org.example._2024_05_02;

import java.util.PriorityQueue;
import java.util.Queue;

public class PQex {
    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(10);
        queue.add(20);
        queue.add(30);
        queue.add(40);
        queue.add(50);

        System.out.println(queue);
        System.out.println(queue.remove());

        System.out.println(queue);


    }
}