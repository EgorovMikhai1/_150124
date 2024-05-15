package org.example._2024_05_15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

public class Param2 {
    public static void main(String[] args) {
//        Info<String> info = new Info<>("AAA");
//
//        System.out.println(info.getValue());
        Info<Integer, String> info = new Info<>(123, "(*&");
        System.out.println(info.getValue1());
        System.out.println(info.getValue2());
    }
}

@Getter
@AllArgsConstructor
@ToString
class Info<E1, E2> {
    private E1 value1;
    private E2 value2;
}