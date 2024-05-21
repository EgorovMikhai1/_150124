package org.example.info.ex3;

import java.util.ArrayList;
import java.util.List;

public class StreamOnCloseExample {

    /**
     * Пример использования метода `onClose()` в Stream API.
     * Метод `onClose()` позволяет задать действие, которое будет выполнено при закрытии потока.
     * В данном примере используется метод `onClose()` для добавления действий при закрытии потоков.
     * 
     * Условия выполнения:
     * - Примеры в методе `main()`.
     * - Одноклассовая структура.
     * - Предоставлены примеры с и без параметров.
     * - Используются комментарии на русском языке.
     * - Упрощены для лучшей читаемости.
     */

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        
        // Пример использования метода onClose() без параметров
        names.stream()
            .filter(name -> name.startsWith("A"))
            .onClose(() -> System.out.println("Закрытие потока без параметров"))
            .forEach(System.out::println);
        
        // Пример использования метода onClose() с параметрами
        names.stream()
            .filter(name -> name.startsWith("B"))
            .onClose(() -> closeStream(names))
            .forEach(System.out::println);
    }
    
    // Метод, вызываемый при закрытии потока с параметрами
    private static void closeStream(List<String> names) {
        System.out.println("Закрытие потока с параметрами");
        names.clear();
    }
}
