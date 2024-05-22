package org.example.info.stream_Info.ex3;

import java.util.ArrayList;
import java.util.List;

public class MapExample {
    public static void main(String[] args) {
        // Пример 1.txt: Применение map() с преобразованием объектов
        // Создаем список сотрудников
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("John", 5000));
        employees.add(new Employee("Alice", 6000));
        employees.add(new Employee("Bob", 4000));

        // Применяем map() для преобразования объектов Employee в объекты EmployeeDTO
        List<EmployeeDTO> employeeDTOs = employees.stream()
                                                  .map(employee -> new EmployeeDTO(employee.getName(), employee.getSalary() * 2))
                                                  .toList();
        // Выводим результат
        System.out.println("DTO сотрудники: " + employeeDTOs);

        // Пример 2: Применение map() с нестандартными параметрами
        // Создаем список чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        // Применяем map() с передачей параметра - начального значения для суммы
        int sum = numbers.stream()
                         .map(num -> num + 10)
                         .reduce(5, Integer::sum);
        // Выводим результат
        System.out.println("Сумма чисел с добавлением 10 и начальным значением 5: " + sum);

        // Пример 3: Применение map() для множественного преобразования
        // Создаем список строк
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");

        // Применяем map() для преобразования каждой строки: первая буква заглавная, затем в нижнем регистре
        List<String> modifiedWords = words.stream()
                                          .map(str -> {
                                              String firstLetter = str.substring(0, 1).toUpperCase();
                                              String restOfWord = str.substring(1).toLowerCase();
                                              return firstLetter + restOfWord;
                                          })
                                          .toList();
        // Выводим результат
        System.out.println("Модифицированные слова: " + modifiedWords);
    }

    // Вспомогательный класс Employee
    static class Employee {
        private String name;
        private int salary;

        public Employee(String name, int salary) {
            this.name = name;
            this.salary = salary;
        }

        public String getName() {
            return name;
        }

        public int getSalary() {
            return salary;
        }

        @Override
        public String toString() {
            return name + ": " + salary;
        }
    }

    // Вспомогательный класс EmployeeDTO
    static class EmployeeDTO {
        private String name;
        private int doubledSalary;

        public EmployeeDTO(String name, int doubledSalary) {
            this.name = name;
            this.doubledSalary = doubledSalary;
        }

        public String getName() {
            return name;
        }

        public int getDoubledSalary() {
            return doubledSalary;
        }

        @Override
        public String toString() {
            return name + ": " + doubledSalary;
        }
    }
}
