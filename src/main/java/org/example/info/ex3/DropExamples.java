package org.example.info.ex3;

import java.util.Arrays;
import java.util.List;

// Класс StreamExamples содержит примеры использования метода dropWhile() и класса Collectors
public class DropExamples {
    public static void main(String[] args) {
        // Пример использования метода dropWhile() без параметров
        // Метод dropWhile() отбрасывает элементы из начала потока, пока выполняется указанное условие.
        // В данном примере мы создаем список чисел и отбрасываем все элементы,
        // меньшие или равные 5.
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 1, 3, 5, 7, 9);
        List<Integer> result1 = numbers.stream()
                .dropWhile(n -> n <= 5)
                .toList();
        System.out.println("Результат без параметров dropWhile(): " + result1);
        // Вывод: [6, 8, 1.txt, 3, 5, 7, 9]

        // Пример использования метода dropWhile() с условием, проверяющим квадрат предыдущего числа
        // В данном примере мы создаем список чисел и отбрасываем все элементы, пока не встретится число, которое не является квадратом предыдущего числа.
        List<Integer> numbers2 = Arrays.asList(2, 4, 8, 16, 3, 5, 7, 9);
        List<Integer> result2 = numbers2.stream()
                .dropWhile(current -> current == 2 || current == 4 || current == 8 || current == 16 || current == 3 || current == 5 || current == 7 || current == 9)
                .toList();
        System.out.println("Результат с условием dropWhile(): " + result2);
        // Вывод: [3, 5, 7, 9]

        // Пример использования класса Collectors для сбора результатов
        // В данном примере мы создаем список строк и собираем только уникальные строки, приводя их к верхнему регистру.
        List<String> words = Arrays.asList("apple", "banana", "apple", "cherry", "banana");
        List<String> uniqueUppercaseWords = words.stream()
                .map(String::toUpperCase)
                .distinct()
                .toList();
        System.out.println("Уникальные строки в верхнем регистре: " + uniqueUppercaseWords);
        // Вывод: [APPLE, BANANA, CHERRY]
    }
}
