package org.example._2024_05_29;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Co2 {
    public static void main(String[] args) {
        List<Person> people =
                Arrays.asList(
                        new Person("QWE", 19, "NY"),
                        new Person("SDF", 23, "SF"),
                        new Person("CVF", 19, "LA"),
                        new Person("GF", 39, "NY"),
                        new Person("RF", 49, "SF"),
                        new Person("VC", 23, "NY"),
                        new Person("VVV", 11, "LA"),
                        new Person("NN", 14, "NY"),
                        new Person("VD", 45, "LA"),
                        new Person("WD", 19, "SF")
                );

        /**
         * группировка по городу
         * возраст 25
         * кол-во в каждой группе
         */
        Map<String, Map<Boolean, Long>> map =
                people.stream()
                        .collect(Collectors.groupingBy(Person::getCity,
                                Collectors.partitioningBy(person -> person.age < 26,
                                        Collectors.counting())));

        System.out.println(map);
    }
}

@AllArgsConstructor
@ToString
@Getter
class Person {
    String name;
    int age;
    String city;
}