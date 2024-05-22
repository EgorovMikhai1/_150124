package org.example.info.stream_Info.ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class SequentialMethodExamples {
    
    /**
     * Метод sequential() используется для преобразования параллельного потока в последовательный поток.
     * Этот метод гарантирует, что операции последующих методов будут выполняться последовательно.
     * В данном примере создается коллекция чисел, затем создается параллельный поток, который преобразуется
     * в последовательный с помощью метода sequential(). Затем происходит фильтрация и преобразование чисел.
     */
    public static void main(String[] args) {
        // Создаем коллекцию чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // Создаем параллельный поток и преобразуем его в последовательный
        Stream<Integer> sequentialStream = numbers.parallelStream().sequential();

        // Фильтрация и преобразование чисел
        sequentialStream
                .filter(n -> n % 2 == 0) // Оставляем только четные числа
                .map(n -> n * 2) // Умножаем каждое число на 2
                .forEach(System.out::println); // Выводим результаты

        /*
         * Результат:
         * 4
         * 8
         * 12
         */
    }
}
