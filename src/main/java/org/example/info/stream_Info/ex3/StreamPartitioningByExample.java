package org.example.info.stream_Info.ex3;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamPartitioningByExample {
    /**
     * Метод partitioningBy() разделяет элементы коллекции на две группы в соответствии с заданным условием.
     * В данном примере будем разделять список чисел на четные и нечетные числа.
     */
    public static void main(String[] args) {
        // Создаем коллекцию чисел
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // Пример 1.txt: Разделение чисел на четные и нечетные с помощью partitioningBy()
        Map<Boolean, List<Integer>> evenOddPartition = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num % 2 == 0));

        // Выводим результат
        System.out.println("Пример 1.txt: Разделение чисел на четные и нечетные:");
        System.out.println("Четные числа: " + evenOddPartition.get(true));
        System.out.println("Нечетные числа: " + evenOddPartition.get(false));
        System.out.println();

        // Пример 2: Разделение строк на две группы - короткие и длинные строки
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Создаем коллекцию с длинами строк
        Map<Boolean, List<String>> shortLongPartition = strings.stream()
                .collect(Collectors.partitioningBy(str -> str.length() <= 5));

        // Выводим результат
        System.out.println("Пример 2: Разделение строк на короткие и длинные:");
        System.out.println("Короткие строки: " + shortLongPartition.get(true));
        System.out.println("Длинные строки: " + shortLongPartition.get(false));
        System.out.println();

        // Пример 3: Разделение объектов Person на две группы - молодые и взрослые
        List<Person> persons = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Mike", 18),
                new Person("Emily", 40)
        );

        // Создаем коллекцию с объектами Person
        Map<Boolean, List<Person>> youngOldPartition = persons.stream()
                .collect(Collectors.partitioningBy(person -> person.getAge() < 30));

        // Выводим результат
        System.out.println("Пример 3: Разделение объектов Person на молодых и взрослых:");
        System.out.println("Молодые люди: " + youngOldPartition.get(true));
        System.out.println("Взрослые люди: " + youngOldPartition.get(false));
    }

    // Класс для представления объекта Person
    static class Person {
        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }

        @Override
        public String toString() {
            return name + " (" + age + ")";
        }
    }
}
