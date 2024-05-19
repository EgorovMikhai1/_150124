package org.example._2024_05_19;

/**
 * При решении задач использовался
 * @FunctionalInterface для лямбда-выражений.
 * Обязательно ли использовать данный интерфейс? Можно ли обходиться без него?
 *
 */
public class Ser1 {
    public static void main(String[] args) {
        MyFunctionalInterface func = () -> System.out.println("Hello, Lambda!");
        func.execute();
    }
}

@FunctionalInterface
interface MyFunctionalInterface {
    void execute();
}