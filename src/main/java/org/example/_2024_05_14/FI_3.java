package org.example._2024_05_14;

public class FI_3 {
    public static void main(String[] args) {
        m2(FI_3::dodo);
    }

    public static void m2(Inter22 inter22) {
        inter22.add();
    }

    public static void dodo() {
        System.out.println("+++");
    }
}

@FunctionalInterface
interface Inter22 {
    void add();
}
