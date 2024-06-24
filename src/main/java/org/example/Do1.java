package org.example;

import lombok.Getter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Do1 {

    @Getter
    private String s ;

    public static void main(String[] args) {

        new HashMap<>();
    }

    @Override
    public String toString() {
        return "Do1{" +
                "s='" + s + '\'' +
                '}';
    }
}

class Car {
    List<Passengers> list;

    public Car() {
        list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            System.out.println("**********");
        }
    }
}

class Passengers {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.list.size());
    }
}