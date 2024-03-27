package org.example._2024_03_27;

public class Parent11 {
    int param;

    public Parent11(int param) {
        this.param = param;
        System.out.println("Parent11 Constructor");
    }
}

class Child11 extends Parent11 {

    String name;

//         Child11("Nik", 55);
    public Child11(String name, int param) {
        super(param);
        this.name = name;
        System.out.println("Child11 Constructor");
    }
}

class Ekaterina {
    public static void main(String[] args) {
        Child11 child11 = new Child11("Nik", 55);
    }
}


