//package org.example._2024_04_11;
//
//import com.github.javafaker.Faker;
//import lombok.AllArgsConstructor;
//import lombok.Data;
//import lombok.Getter;
//
//import java.math.BigDecimal;
//import java.util.Random;
//
//@Data
//@AllArgsConstructor
//public class Company {
//    private String name;
//    private Employee[] employees;
//}
//
//
//@Data
//@AllArgsConstructor
//class Employee {
//    private String fName;
//    private double salary;
//}
//
//class Test3 {
//
//    private static final Faker FAKER = new Faker();
//    private static final Random RANDOM = new Random();
//
//    public static void main(String[] args) {
//        Employee e1 = new Employee(FAKER.funnyName().name(), RANDOM.nextDouble(1500, 10000));
//        Employee e2 = new Employee(FAKER.funnyName().name(), RANDOM.nextDouble(1500, 10000));
//        Employee e3 = new Employee(FAKER.funnyName().name(), RANDOM.nextDouble(1500, 10000));
//        Employee e4= new Employee(FAKER.funnyName().name(), RANDOM.nextDouble(1500, 10000));
//
//        Employee[] employees = {e1, e2, e3, e4};
//
//        Company company = new Company(FAKER.company().name(), employees);
//
//    }
//}