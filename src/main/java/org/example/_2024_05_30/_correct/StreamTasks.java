package org.example._2024_05_30._correct;

import lombok.Getter;

import java.util.*;
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
                .filter(p -> p.age >= 20) // Ошибка: должно быть p.age > 20
                .map(p -> p.name)
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 2. Найти сумму возрастов всех людей, имя которых начинается с буквы 'A'.
    public int task2(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.startsWith("A"))
                .map(p -> p.age)
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .reduce(1, Integer::sum); // Ошибка: начальное значение должно быть 0
    }

    // 3. Получить список уникальных возрастов людей.
    public List<Integer> task3(List<Person> people) {
        return people.stream()
                .map(p -> p.age)
                .distinct()
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList()); // Ошибка: нужно использовать Collectors.toSet()
    }

    // 4. Найти средний возраст людей младше 18 лет.
    public double task4(List<Person> people) {
        return people.stream()
                .filter(p -> p.age > 18) // Ошибка: должно быть p.age < 18
                .mapToInt(p -> p.age)
                .boxed() // добавлен boxed как дополнительный intermediate метод
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    // 7. Получить список имен всех людей, возраст которых делится на 3.
    public List<String> task7(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 2 == 0) // Ошибка: должно быть p.age % 3 == 0
                .map(p -> p.name)
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList());
    }


    // 9. Получить список имен людей, отсортированных в алфавитном порядке.
    public List<String> task9(List<Person> people) {
        return people.stream()
                .map(p -> p.name)
                .sorted(Comparator.reverseOrder()) // Ошибка: должно быть sorted() без параметров для обычной сортировки
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 10. Найти общую длину всех имен людей, старше 30 лет.
    public int task10(List<Person> people) {
        return people.stream()
                .filter(p -> p.age <= 30) // Ошибка: должно быть p.age > 30
                .map(p -> p.name)
                .mapToInt(String::length)
                .sum();
    }

    // 11. Получить список людей, чьи имена короче 4 символов.
    public List<Person> task11(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.length() >= 4) // Ошибка: должно быть p.name.length() < 4
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .sorted(Comparator.comparingInt(p -> p.name.length())) // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 12. Найти самый длинный возраст человека.
    public int task12(List<Person> people) {
        return people.stream()
                .map(p -> p.age)
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .max(Integer::compare).orElse(0); // Ошибка: метод max должен принимать Comparator.comparingInt
    }

    // 13. Получить список всех людей, отсортированных по длине имени.
    public List<Person> task13(List<Person> people) {
        return people.stream()
                .sorted(Comparator.comparing(p -> p.name)) // Ошибка: нужно использовать Comparator.comparingInt(p -> p.name.length())
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 14. Найти имя самого молодого человека.
    public String task14(List<Person> people) {
        return people.stream()
                .min(Comparator.comparingInt(p -> p.age))
                .map(p -> p.name)
                .orElse(""); // Ошибка: не обрабатывается случай, когда список пуст
    }

    // 15. Получить список возрастов людей, имена которых заканчиваются на 'n'.
    public List<Integer> task15(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.endsWith("n"))
                .map(p -> p.age)
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 16. Найти общий возраст всех людей с уникальными именами.
    public int task16(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(p -> p.name)) // Ошибка: distinct работает на всём объекте, нужно distinct по именам
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
                .collect(Collectors.toList()); // Ошибка: нужно использовать Comparator.reverseOrder()
    }

    // 18. Найти средний возраст людей, чьи имена состоят из 5 символов.
    public double task18(List<Person> people) {
        return people.stream()
                .filter(p -> p.name.length() != 5) // Ошибка: должно быть p.name.length() == 5
                .mapToInt(p -> p.age)
                .boxed() // добавлен boxed как дополнительный intermediate метод
                .collect(Collectors.averagingInt(Integer::intValue));
    }

    // 19. Получить список имен людей, возраст которых кратен 5.
    public List<String> task19(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 5 != 0) // Ошибка: должно быть p.age % 5 == 0
                .map(p -> p.name)
                .sorted() // добавлен sorted как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 20. Найти сумму длин всех имен людей, у которых возраст четный.
    public int task20(List<Person> people) {
        return people.stream()
                .filter(p -> p.age % 2 != 0) // Ошибка: должно быть p.age % 2 == 0
                .map(p -> p.name)
                .mapToInt(String::length)
                .sum();
    }

    // 21. Группировать людей по городу и находить максимальный возраст в каждой группе.
    public Map<String, Optional<Integer>> task21(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.city,
                        Collectors.mapping(
                                p -> p.age,
                                Collectors.maxBy(Integer::compareTo)
                        ))); // Ошибка: нужно использовать Collectors.maxBy(Comparator.naturalOrder())
    }

    // 22. Получить список людей, у которых зарплата больше 50000, отсортированных по убыванию зарплаты.
    public List<Person> task22(List<Person> people) {
        return people.stream()
                .filter(p -> p.salary > 50000)
                .sorted(Comparator.comparingDouble(p -> p.salary)) // Ошибка: нужно использовать reversed() для убывающей сортировки
                .distinct() // добавлен distinct как дополнительный intermediate метод
                .collect(Collectors.toList());
    }

    // 23. Найти город с наибольшим количеством людей старше 30 лет.
    public String task23(List<Person> people) {
        return people.stream()
                .filter(p -> p.age > 30)
                .collect(Collectors.groupingBy(
                        p -> p.city,
                        Collectors.counting()))
                .entrySet().stream()
                .max(Map.Entry.comparingByValue())
                .map(Map.Entry::getKey)
                .orElse(""); // Ошибка: не обрабатывается случай, когда список пуст
    }

    // 24. Группировать людей по первой букве имени и находить среднюю зарплату в каждой группе.
    public Map<Character, Double> task24(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.name.charAt(0),
                        Collectors.averagingInt(p -> (int) p.salary))); // Ошибка: нужно использовать Collectors.averagingDouble(p -> p.salary)
    }

    // 25. Найти человека с самой длинной электронной почтой в каждом городе.
    public Map<String, Optional<Person>> task25(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.city,
                        Collectors.maxBy(Comparator.comparingInt(p -> p.email.length())))); // Ошибка: должно быть comparingInt для длин электронной почты
    }

    // 26. Группировать людей по городу и находить максимальный возраст в каждой группе, результат в виде Map<String, Integer>.
//    public Map<String, Integer> task26(List<Person> people) {
//        return people.stream()
//                .collect(Collectors.groupingBy(
//                        p -> p.city,
//                        Collectors.collectingAndThen(
//                                Collectors.maxBy(Comparator.comparingInt(p -> p.age)),
//                                opt -> opt.map(p -> p.salary).orElse(0) // Ошибка: должно быть p.age вместо p.salary
//                        )
//                ));
//    }

    // 27. Получить список имен людей с зарплатой больше 50,000 и возрастом меньше 30, отсортированных по возрасту.
    public List<String> task27(List<Person> people) {
        return people.stream()
                .filter(p -> p.salary < 50000) // Ошибка: должно быть p.salary > 50000
                .filter(p -> p.age >= 30) // Ошибка: должно быть p.age < 30
                .map(p -> p.city) // Ошибка: должно быть p.name
                .sorted(Comparator.comparingInt(p -> p.length())) // Ошибка: должно быть sorted(Comparator.comparingInt(p -> p.age))
                .collect(Collectors.toList());
    }

    // 28. Найти город с наибольшей средней зарплатой среди людей старше 25 лет.
//    public String task28(List<Person> people) {
//        return people.stream()
//                .filter(p -> p.age <= 25) // Ошибка: должно быть p.age > 25
//                .collect(Collectors.groupingBy(
//                        p -> p.city,
//                        Collectors.averagingInt(p -> p.salary) // Ошибка: должно быть Collectors.averagingDouble(p -> p.salary)
//                ))
//                .entrySet().stream()
//                .min(Map.Entry.comparingByValue()) // Ошибка: должно быть max(Map.Entry.comparingByValue())
//                .map(Map.Entry::getKey)
//                .orElse("Unknown");
//    }

    // 29. Группировать людей по первой букве имени и находить суммарный возраст в каждой группе, результат в виде Map<Character, Integer>.
    public Map<Character, Integer> task29(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.name.charAt(0),
                        Collectors.summingInt(p -> p.email.length()) // Ошибка: должно быть p.age вместо p.email.length()
                ))
                .entrySet().stream()
                .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())) // Ошибка: должно быть comparingByKey() без параметров для обычной сортировки
                .collect(Collectors.toMap(
                        Map.Entry::getKey,
                        Map.Entry::getValue,
                        (e1, e2) -> e1, // Ошибка: не требуется третий параметр в Collectors.toMap для слияния значений
                        LinkedHashMap::new
                ));
    }

    // 30. Найти человека с самой высокой зарплатой в каждом городе, результат в виде Map<String, Person>.
    public Map<String, Person> task30(List<Person> people) {
        return people.stream()
                .collect(Collectors.groupingBy(
                        p -> p.city,
                        Collectors.collectingAndThen(
                                Collectors.maxBy(Comparator.comparingDouble(p -> p.salary)),
                                Optional::get // Ошибка: не обрабатывается случай, когда Optional пуст
                        )
                ));
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
