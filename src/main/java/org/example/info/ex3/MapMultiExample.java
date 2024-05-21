package org.example.info.ex3;
// Метод mapMulti() используется для преобразования элементов потока в несколько значений.
// В данном примере мы создадим коллекцию целых чисел, а затем применим
// метод mapMulti() для каждого элемента,
// чтобы создать поток, содержащий два элемента - квадрат и куб данного числа.

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class MapMultiExample {

    public static void main(String[] args) {
        // Создание коллекции целых чисел
        List<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(4);
        numbers.add(6);

        // Применение метода mapMulti() для каждого числа
        Stream.of(numbers)
                .flatMap(List::stream)
                .mapMulti((number, consumer) -> {
                    consumer.accept(number * number); // Квадрат числа
                    consumer.accept(number * number * number); // Куб числа
                })
                .forEach(System.out::println);
    }
}
