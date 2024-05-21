package org.example.info.ex3;

import java.util.Arrays;
import java.util.List;

public class FlatMapExample {

    /**
     * Метод flatMap() применяет функцию к каждому элементу стрима и затем "разглаживает" результаты
     * в один плоский стрим.
     */
    public static void main(String[] args) {
        // Пример 1.txt: Разбиение строки на отдельные символы и их удвоение
        List<String> words = Arrays.asList("Привет", "Мир");
        List<String> doubledLetters = words.stream()
                .flatMap(word -> word.chars()
                        .mapToObj(c -> String.valueOf((char) c))
                        .map(letter -> letter + letter))
                .toList();
        System.out.println("Разбиение строки на символы и их удвоение: " + doubledLetters);

        // Пример 2: Разделение предложений на слова и преобразование слов в верхний регистр
        List<String> sentences = Arrays.asList("Java - прекрасный язык программирования", "Stream API упрощает обработку коллекций");
        List<String> uppercaseWords = sentences.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .map(String::toUpperCase)
                .toList();
        System.out.println("Разбиение строк на слова и преобразование в верхний регистр: " + uppercaseWords);

        // Пример 3: Создание всех возможных комбинаций пар чисел из двух списков
        List<Integer> list1 = Arrays.asList(1, 2, 3);
        List<Integer> list2 = Arrays.asList(4, 5, 6);
        List<String> combinations = list1.stream()
                .flatMap(i -> list2.stream()
                        .flatMap(j -> list2.stream()
                                .map(k -> "(" + i + ", " + j + ", " + k + ")")))
                .toList();
        System.out.println("Все возможные комбинации чисел: " + combinations);
    }
}
