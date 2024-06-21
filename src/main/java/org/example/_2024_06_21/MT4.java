package org.example._2024_06_21;

public class MT4 extends Thread {

    @Override
    public void run() {
        System.out.println("Hello World");
    }

    public static void main(String[] args) {
        MT4 m = new MT4();
        m.start();
    }
}
