package org.example._2024_05_14;

public class FI_1 {
    public static void main(String[] args) {
//        m1(() -> System.out.println("+++"));
//        m1(new Inter1() {
//            @Override
//            public void add() {
//
//            }
//        });
    }

    public static void m1(Inter1 inter1) {
        System.out.println("123");
        inter1.add();
    }
}

//@FunctionalInterface
interface Inter1 {
    void add();

    void aqdd(int a);
}