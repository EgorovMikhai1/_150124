package org.example._2024_05_14;

public class FI_1 {
    public static void main(String[] args) {
        m1(() -> System.out.println("+++"));
    }

    public static void m1(Inter1 inter1) {
        System.out.println("123");
        inter1.add();
    }
}

@FunctionalInterface
interface Inter1 {
    void add();
}