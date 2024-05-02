package org.example._2024_05_02;

import java.util.Stack;
//todo
public class QueueUsingTwoStacks {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public QueueUsingTwoStacks() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int x) {
    }

    public int dequeue() {
        return 0;
    }

    public boolean isEmpty() {
        return true;
    }

    public static void main(String[] args) {
        QueueUsingTwoStacks queue = new QueueUsingTwoStacks();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        System.out.println(queue.dequeue()); // Вывод: 1
        System.out.println(queue.dequeue()); // Вывод: 2
        System.out.println(queue.isEmpty()); // Вывод: false
        System.out.println(queue.dequeue()); // Вывод: 3
        System.out.println(queue.isEmpty()); // Вывод: true
    }
}
