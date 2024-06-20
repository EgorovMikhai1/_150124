package org.example.dryKissYagni;

public class SUT {


    public static String toUpperCase1(String input) {
        return input.toUpperCase();
    }

    public static String toLowerCase2(String input) {
        return input.toLowerCase();
    }

    // Дублирование конвертации строки в массив символов
    public static char[] toCharArray2(String input) {
        char[] result = new char[input.length()];
        for (int i = 0; i < input.length(); i++) {
            result[i] = input.charAt(i);
        }
        return result;
    }
}
