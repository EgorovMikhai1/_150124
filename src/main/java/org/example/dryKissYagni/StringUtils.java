package org.example.dryKissYagni;//package org.example.dryKissYagni;
//
//import java.util.stream.Collectors;
//
//// Нарушение KISS:
//public class StringUtils {
//    public static String toUpperCase(String input) {
//        // Сложная реализация для простой операции
//        // ...
//        return input.chars()
//                .mapToObj(Character::toString)
//                .map(s -> {
//                    // Добавляем дополнительную логику преобразования, например, пропуск знаков препинания
//                    if (s.equals(" ")) {
//                        return " ";
//                    } else {
//                        return s.toUpperCase();
//                    }
//                })
//                .collect(Collectors.joining());
//    }
//}
//
