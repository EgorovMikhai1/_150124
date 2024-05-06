package org.example._2024_05_06.taski;

import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;

public class StackQueueExercises {

    public static void main(String[] args) {
        // Задача 1: Реверс элементов в очереди.
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        System.out.println("Original Queue: " + queue);
        reverseQueue(queue);
        System.out.println("Reversed Queue: " + queue);

        // Задача 2: Проверка на сбалансированность скобок.
        String expression = "{[()]}";
        System.out.println("Expression: " + expression + " is balanced: " + isBalanced(expression));

        // Задача 3: Сортировка стека с использованием дополнительного стека.
        Stack<Integer> stack = new Stack<>();
        stack.push(34);
        stack.push(3);
        stack.push(31);
        stack.push(98);
        stack.push(92);
        stack.push(23);
        System.out.println("Original Stack: " + stack);
        sortStack(stack);
        System.out.println("Sorted Stack: " + stack);

        // Задача 4: Первый неповторяющийся символ.
        String stream = "geeksforgeeks";
        firstNonRepeating(stream);

        // Задача 5: Генерация всех возможных правильных комбинаций скобок.
        int n = 3;
        generateParenthesis(n);
    }

    // Задача 1: Реверс очереди.
    public static void reverseQueue(Queue<Integer> queue) {
        Stack<Integer> stack = new Stack<>();

    }

    // Задача 2: Проверка сбалансированности скобок.
    public static boolean isBalanced(String expression) {
        Stack<Character> stack = new Stack<>();

        return stack.isEmpty();
    }

    // Задача 3: Сортировка стека.
    public static void sortStack(Stack<Integer> stack) {
        Stack<Integer> tempStack = new Stack<>();


    }

    // Задача 4: Первый неповторяющийся символ.
    public static void firstNonRepeating(String stream) {
//        int[] charCount = new int[26];
//        Queue<Character> queue = new LinkedList<>();

    }

    // Задача 5: Генерация всех возможных правильных комбинаций скобок.
    public static void generateParenthesis(int n) {
        generateParenthesisRecursive("", n, n);
    }

    private static void generateParenthesisRecursive(String current, int open, int close) {

    }
}