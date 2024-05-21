package org.example.info.ex3;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class StreamSortedExamples {
    public static void main(String[] args) {
        // Пример 1.txt: Сортировка списка строк в естественном порядке
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> sortedStrings = strings.stream()
                .sorted()
                .toList();
        System.out.println("Естественная сортировка: " + sortedStrings);

        // Пример 2: Сортировка списка чисел в порядке убывания
        List<Integer> numbers = Arrays.asList(5, 2, 8, 1, 6);
        List<Integer> descendingNumbers = numbers.stream()
                .sorted(Comparator.reverseOrder()) // Используем встроенный компаратор для сортировки в обратном порядке
                .toList();
        System.out.println("Сортировка чисел в порядке убывания: " + descendingNumbers);

        // Пример 3: Сортировка списка строк по длине
        List<String> fruits = Arrays.asList("apple", "banana", "cherry", "date");
        List<String> sortedByLength = fruits.stream()
                .sorted(Comparator.comparingInt(String::length)) // Используем компаратор, сравнивающий строки по длине
                .toList();
        System.out.println("Сортировка строк по длине: " + sortedByLength);

        // Пример 4: Сортировка списка пользователей по возрасту, а затем по имени
        class User {
            private String name;
            private int age;

            public User(String name, int age) {
                this.name = name;
                this.age = age;
            }

            public String getName() {
                return name;
            }

            public int getAge() {
                return age;
            }
        }

        List<User> users = Arrays.asList(
                new User("Alice", 25),
                new User("Bob", 30),
                new User("Charlie", 20)
        );

        List<User> sortedUsers = users.stream()
                .sorted(Comparator.comparingInt(User::getAge).thenComparing(User::getName)) // Используем компаратор, сравнивающий сначала по возрасту, затем по имени
                .toList();

        System.out.println("Сортировка пользователей по возрасту, а затем по имени: ");
        for (User user : sortedUsers) {
            System.out.println("Имя: " + user.getName() + ", Возраст: " + user.getAge());
        }
    }
}
