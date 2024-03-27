package org.example._2024_03_27;

public class Parent22 {

    public Parent22(int x) {
        System.out.println("Parent22 + param " + x);
    }
}

class Child22 extends Parent22 {

    public Child22(int x) {
        super(x);
        System.out.println("Child22 + param " + x);
    }

    public Child22() {
        super(11);
        System.out.println("Child22 + param 11");
    }

    public static void main(String[] args) {
        new Child22();
        new Child22(999);
    }
}
