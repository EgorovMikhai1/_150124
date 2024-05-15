package org.example._2024_05_15;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

public class Param5 {
    public static void main(String[] args) {

    }
}

@Getter
@AllArgsConstructor
@ToString
class Tem<T extends Parent> {
    private T t;
}

class Parent {

    public static <T extends Number> T getS(List<? extends Parent> list) {
        return null;
    }
}

class Child extends Parent {

}