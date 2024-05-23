package org.example._2024_05_23;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Cla1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Person> people = Arrays.asList(
                new Person("W", 45),
                new Person("S", 23),
                new Person("E", 34),
                new Person("X", 42)
        );

        IntStream ageStream = people.stream().mapToInt(Person::getAge);

//        int sumAge = ageStream.sum();


        /**
         * mapToInt
         */
    }
}

@Getter
@AllArgsConstructor
class Person {
    private String name;
    private int age;
}