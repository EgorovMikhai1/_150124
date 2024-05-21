package org.example.info.ex3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamTakeWhileExample {
    public static void main(String[] args) {
        // Создаем коллекцию строк
        List<String> words = Arrays.asList("apple", "banana", "cherry", "date", "elderberry");

        // Пример использования takeWhile() без параметров
        // Метод takeWhile() будет брать элементы из коллекции, пока выполняется заданное условие
        List<String> result1 = new ArrayList<>();
        words.stream()
                .takeWhile(word -> word.length() < 6) // Берем строки, длина которых меньше 6 символов
                .forEach(result1::add);

        System.out.println("Пример 1.txt: takeWhile() без параметров");
        System.out.println("Результат: " + result1); // Вывод: [apple, banana]
        System.out.println();

        // Пример использования takeWhile() с параметром
        // Метод takeWhile() будет брать элементы из коллекции, пока выполняется заданное условие,
        // и завершится, когда встретит элемент, не удовлетворяющий условию
        List<Integer> numbers = Arrays.asList(2, 4, 6, 7, 8, 10);
        List<Integer> result2 = new ArrayList<>();
        numbers.stream()
                .takeWhile(num -> num % 2 == 0) // Берем четные числа из коллекции
                .forEach(result2::add);

        System.out.println("Пример 2: takeWhile() с параметром");
        System.out.println("Результат: " + result2); // Вывод: [2, 4, 6]
        System.out.println();
        
        // Пример использования takeWhile() с параметром встроенного класса
        // Метод takeWhile() будет брать элементы из коллекции, пока выполняется заданное условие,
        // и завершится, когда встретит элемент, не удовлетворяющий условию
        List<Person> people = Arrays.asList(
                new Person("John", 25),
                new Person("Alice", 30),
                new Person("Bob", 35),
                new Person("Eve", 20)
        );
        List<Person> result3 = new ArrayList<>();
        people.stream()
                .takeWhile(person -> person.getAge() < 30) // Берем людей, возраст которых меньше 30 лет
                .forEach(result3::add);

        System.out.println("Пример 3: takeWhile() с параметром встроенного класса");
        System.out.println("Результат: " + result3); // Вывод: [Person{name='John', age=25}, Person{name='Alice', age=30}]
    }

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
            return "Person{" +
                    "name='" + name + '\'' +
                    ",age=" + age +
                    '}';
        }
    }
}
