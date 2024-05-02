package org.example._2024_05_02;

import lombok.ToString;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PQEX2 {
    public static void main(String[] args) {
        Queue<Fish> queue = new PriorityQueue<>();

        queue.add(new Fish("L", 44));
        queue.add(new Fish("J", 1));
        queue.add(new Fish("X", 99999));
        queue.add(new Fish("F", 500));
        queue.add(new Fish("Z", -777));
        queue.add(new Fish("Q", 25));
        queue.add(new Fish("W", 10));
        queue.add(new Fish("V", 4));
        queue.add(new Fish("B", 58));
        queue.add(new Fish("G", 6));
        queue.add(new Fish("D", 66));
        queue.add(new Fish("DD", 66));

        System.out.println(queue);
        System.out.println("----------------------------------------------");

        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());

        System.out.println("----------------------------------------------");
        System.out.println(queue);
    }
}

@ToString
class Fish implements Comparable<Fish>{
    String name;
    int weight;

    public Fish(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    @Override
    public int compareTo(Fish o) {
        return this.weight - o.weight;
    }
}

class FishComparatorByName implements Comparator<Fish> {

    @Override
    public int compare(Fish o1, Fish o2) {
        return o1.name.compareTo(o2.name);
    }
}