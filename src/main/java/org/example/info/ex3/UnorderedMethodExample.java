package org.example.info.ex3; /**
 * Метод: unordered()
 * Назначение: Указывает, что порядок элементов после операции не имеет значения.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class UnorderedMethodExample {
    public static void main(String[] args) {
// Пример 1: использование метода unordered() без параметров
// Создаем коллекцию чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(8);
        numbers.add(2);
        numbers.add(1);
        numbers.add(4);
        // Создаем поток из коллекции и применяем метод unordered()
        Stream<Integer> stream1 = numbers.stream().unordered();

        // Выводим элементы потока
        stream1.forEach(System.out::println);
        // Результат: порядок вывода элементов может быть случайным

        // Пример 2: использование метода unordered() с параметрами
        // Создаем коллекцию строк
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");

        // Создаем параллельный поток из коллекции и применяем метод unordered()
        Stream<String> stream2 = words.parallelStream().unordered();

        // Фильтруем строки, оставляя только те, которые начинаются с буквы "a"
        Stream<String> filteredStream = stream2.filter(s -> s.startsWith("a"));

        // Выводим отфильтрованные элементы потока
        filteredStream.forEach(System.out::println);
        // Результат: порядок вывода элементов может быть случайным, но все элементы начинаются с буквы "a"
    }
}
