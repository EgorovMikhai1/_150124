package org.example._2024_05_02;

import java.util.LinkedList;
import java.util.Queue;

public class Qex1 {
    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();
        Queue<Integer> emptyQueue = new LinkedList<>();

        queue.add(12);
        queue.add(2);
        queue.add(33);
        queue.add(4);
        queue.add(5);

//        System.out.println(emptyQueue);

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        //System.out.println(emptyQueue);

    }
}
