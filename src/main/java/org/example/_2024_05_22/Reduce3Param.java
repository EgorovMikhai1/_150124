//package org.example._2024_05_22;
//
//import java.util.Arrays;
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//import java.util.function.BiFunction;
//
///**
// * <U> U reduce(U identity,
// *                  BiFunction<U, ? super T, U> accumulator,
// *                  BinaryOperator<U> combiner);
// */
//public class Reduce3Param {
//    public static void main(String[] args) {
//        List<Person> personList = Arrays.asList(
//                new Person(1, "A"),
//                new Person(2, "S"),
//                new Person(3, "W"),
//                new Person(4, "E"),
//                new Person(5, "F")
//        );
//
//        Map<Integer, String> map = new HashMap();
//
//        //add to map
//        BiFunction<Map<Integer, String>, Person, Map<Integer, String>>
//
//
//    }
//
//}
//
//
//class Person {
//    int id;
//    String name;
//
//    public Person(int id, String name) {
//        this.id = id;
//        this.name = name;
//    }
//}