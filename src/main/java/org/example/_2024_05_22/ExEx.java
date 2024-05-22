package org.example._2024_05_22;

public class ExEx {
    public int get(int a, int b) {
        return a + b;
    }

    public void printHello(int el) {
        System.out.println("Hello " + el);
    }

    public static void main(String[] args) {
       ExEx ex = new ExEx();

       ex.printHello(ex.get(3, 4));
    }
}
