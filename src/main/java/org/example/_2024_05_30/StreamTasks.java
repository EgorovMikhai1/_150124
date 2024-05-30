package org.example._2024_05_30;

import lombok.Getter;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class StreamTasks {

    @Getter
    static class Person {
        String name;
        int age;
        String city;
        String email;
        double salary;

        Person(String name, int age, String city, String email, double salary) {
            this.name = name;
            this.age = age;
            this.city = city;
            this.email = email;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return "Person{name='" + name + "', age=" + age + ", city='" + city + "', email='" + email + "', salary=" + salary + '}';
        }
    }

    // 1. Найти всех людей старше 20 лет и вернуть их имена в списке.
    public List<String> task1(List<Person> people) {
        return people.stream()
                .filter(p -> p.age >= 20)
                .map(p -> p.name)
                .sorted()
                .collect(Collectors.toList());
    }

    // 2. Найти сумму возрастов всех людей, имя которых начинается с буквы 'A'.
    public int task2(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.startsWith("A"))
                .map(p -> p.age)
                .distinct()
                .reduce(1, Integer::sum);
    }

    // 3. Получить список уникальных возрастов людей.
    public List<Integer> task3(List<Person> people) {
        return people.stream()
                .map(p -> p.age)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // 4. Найти средний возраст людей младше 18 лет.
    public double task4(List<Person> people) {
        return people.stream()
                .filter(p -> p.age > 18)
                .mapToInt(p -> p.age)
                .boxed()
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    // 7. Получить список имен всех людей, возраст которых делится на 3.
    public List<String> task7(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 2 == 0)
                .map(p -> p.name)
                .sorted()
                .collect(Collectors.toList());
    }


    // 9. Получить список имен людей, отсортированных в алфавитном порядке.
    public List<String> task9(List<Person> people) {
        return people.stream()
                .map(p -> p.name)
                .sorted(Comparator.reverseOrder())
                .distinct()
                .collect(Collectors.toList());
    }

    // 10. Найти общую длину всех имен людей, старше 30 лет.
    public int task10(List<Person> people) {
        return people.stream()
                .filter(p -> p.age <= 30)
                .map(p -> p.name)
                .mapToInt(String::length)
                .sum();
    }

    // 11. Получить список людей, чьи имена короче 4 символов.
    public List<Person> task11(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.length() >= 4)
                .distinct()
                .sorted(Comparator.comparingInt(p -> p.name.length()))
                .collect(Collectors.toList());
    }

    // 12. Найти самый длинный возраст человека.
    public int task12(List<Person> people) {
        return people.stream()
                .map(p -> p.age)
                .sorted()
                .max(Integer::compare).orElse(0);
    }

    // 13. Получить список всех людей, отсортированных по длине имени.
    public List<Person> task13(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(p -> p.name))
                .distinct()
                .collect(Collectors.toList());
    }

    // 14. Найти имя самого молодого человека.
    public String task14(List<Person> people) {
        return people.stream()
                .min(Comparator.comparingInt(p -> p.age))
                .map(p -> p.name)
                .orElse("");
    }

    // 15. Получить список возрастов людей, имена которых заканчиваются на 'n'.
    public List<Integer> task15(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.endsWith("n"))
                .map(p -> p.age)
                .distinct()
                .sorted()
                .collect(Collectors.toList());
    }

    // 16. Найти общий возраст всех людей с уникальными именами.
    public int task16(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(p -> p.name))
                .values().stream()
                .flatMap(List::stream)
                .mapToInt(p -> p.age)
                .sum();
    }

    // 17. Получить список имен всех людей, отсортированных в обратном алфавитном порядке.
    public List<String> task17(List<Person> people) {
        return people.stream()
                .map(p -> p.name)
                .sorted()
                .collect(Collectors.toList());
    }

    // 18. Найти средний возраст людей, чьи имена состоят из 5 символов.
    public double task18(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.length() != 5)
                .mapToInt(p -> p.age)
                .boxed()
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    // 19. Получить список имен людей, возраст которых кратен 5.
    public List<String> task19(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 5 != 0)
                .map(p -> p.name)
                .sorted()
                .collect(Collectors.toList());
    }

    // 20. Найти сумму длин всех имен людей, у которых возраст четный.
    public int task20(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 2 != 0)
                .map(p -> p.name)
                .mapToInt(String::length)
                .sum();
    }

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("John", 25, "New York", "john@example.com", 50000),
                new Person("Alice", 32, "Los Angeles", "alice@example.com", 60000),
                new Person("Bob", 17, "Chicago", "bob@example.com", 45000),
                new Person("Anna", 22, "Miami", "anna@example.com", 47000),
                new Person("Chris", 15, "Seattle", "chris@example.com", 40000),
                new Person("Jennifer", 19, "Boston", "jennifer@example.com", 52000),
                new Person("Tom", 40, "Houston", "tom@example.com", 70000),
                new Person("Jerry", 30, "San Francisco", "jerry@example.com", 65000)
        );

        StreamTasks tasks = new StreamTasks();

        System.out.println("Task 1: " + tasks.task1(people));
        System.out.println("Task 2: " + tasks.task2(people));
        System.out.println("Task 3: " + tasks.task3(people));
        System.out.println("Task 4: " + tasks.task4(people));
        System.out.println("Task 7: " + tasks.task7(people));
        System.out.println("Task 9: " + tasks.task9(people));
        System.out.println("Task 10: " + tasks.task10(people));
        System.out.println("Task 11: " + tasks.task11(people));
        System.out.println("Task 12: " + tasks.task12(people));
        System.out.println("Task 13: " + tasks.task13(people));
        System.out.println("Task 14: " + tasks.task14(people));
        System.out.println("Task 15: " + tasks.task15(people));
        System.out.println("Task 16: " + tasks.task16(people));
        System.out.println("Task 17: " + tasks.task17(people));
        System.out.println("Task 18: " + tasks.task18(people));
        System.out.println("Task 19: " + tasks.task19(people));
        System.out.println("Task 20: " + tasks.task20(people));
    }
}