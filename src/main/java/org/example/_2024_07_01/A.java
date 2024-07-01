package org.example._2024_07_01;

public class A extends Thread {

    @Override
    public void run() {
        System.out.println("AAA");
    }

    public static void main(String[] args) {
        new A().start();
    }
}