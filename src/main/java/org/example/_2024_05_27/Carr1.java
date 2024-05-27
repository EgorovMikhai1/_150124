package org.example._2024_05_27;

import java.util.function.Function;

public class Carr1 {

    public static int fun1() {
        return 10;
    }

    public static int fun2() {
        return 20;
    }

    public static int fun3() {
        return 30;
    }

    public static void main(String[] args) {
        Function<Integer, Function<Integer, Function<Integer, Integer>>> result
                = x -> y -> z -> 2 * x + 3 * y + 5 * z;

        System.out.println("RESULT: " + result.apply(fun1()).apply(fun2()).apply(fun3()));
    }
}
