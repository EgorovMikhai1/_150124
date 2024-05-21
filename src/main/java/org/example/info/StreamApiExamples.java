package org.example.info;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamApiExamples {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 20, 3, 4, 1, 1, 5, 6, 7, 8);

        // Примеры использования методов Stream API

        // 1. count(): Выводит количество элементов в потоке (10 в данном случае)
        long count = numbers.stream().count();
        System.out.println("Count: " + count);

        // 2. max(): Выводит максимальный элемент в потоке (20 в данном случае)
        Optional<Integer> max = numbers.stream().max(Integer::compareTo);
        max.ifPresent(value -> System.out.println("Max: " + value));

        // 3. min(): Выводит минимальный элемент в потоке (1.txt в данном случае)
        Optional<Integer> min = numbers.stream().min(Integer::compareTo);
        min.ifPresent(value -> System.out.println("Min: " + value));

        // 4. findFirst(): Выводит первый элемент в потоке (1.txt в данном случае)
        Optional<Integer> first = numbers.stream().findFirst();
        first.ifPresent(value -> System.out.println("First: " + value));

        // 5. findAny(): Выводит любой элемент из потока (может быть разным при каждом запуске)
        Optional<Integer> any = numbers.stream().findAny();
        any.ifPresent(value -> System.out.println("Any: " + value));

        // 6. forEach(): Выводит каждый элемент в потоке
        System.out.print("ForEach: ");
        numbers.stream().forEach(System.out::print);
        System.out.println();

        // 7. distinct(): Выводит список с удаленными повторяющимися элементами
        List<Integer> distinctList = numbers.stream().distinct().toList();
        System.out.println("Distinct: " + distinctList);

        // 8. skip(): Пропускает первые 5 элементов и выводит оставшиеся (6, 7, 8 в данном случае)
        List<Integer> skipList = numbers.stream().skip(5).toList();
        System.out.println("Skip: " + skipList);

        // 9. sorted(): Выводит отсортированный список элементов (1.txt, 1.txt, 1.txt, 3, 4, 5, 6, 7, 8, 20 в данном случае)
        List<Integer> sortedList = numbers.stream().sorted().toList();
        System.out.println("Sorted: " + sortedList);

        // 10. peek(): Выводит каждый элемент в потоке и возвращает список всех элементов
        List<Integer> peekList = numbers.stream().peek(System.out::println).toList();
        System.out.println("Peek: " + peekList);

        // 11. limit(): Выводит первые 3 элемента в потоке (1, 20, 3 в данном случае)
        List<Integer> limitList = numbers.stream().limit(3).toList();
        System.out.println("Limit: " + limitList);

        // 12. toArray(): Преобразует поток в массив ([1.txt, 20, 3, 4, 1.txt, 1.txt, 5, 6, 7, 8] в данном случае)
        Integer[] arr = numbers.toArray(Integer[]::new);
        System.out.println("Array: " + Arrays.toString(arr));

        // 13. reduce(): Суммирует все элементы в потоке и выводит результат (56 в данном случае)
        Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
        sum.ifPresent(value -> System.out.println("Sum: " + value));

        // 14. collect(): Собирает элементы в потоке в коллекцию Set (без повторений) и выводит результат
        Set<Integer> set = numbers.stream().collect(Collectors.toSet());
        System.out.println("Set: " + set);

        // 15. mapToInt(): Преобразует поток в IntStream и суммирует все элементы в потоке (56 в данном случае)
        int intSum = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("IntSum: " + intSum);
    }
}