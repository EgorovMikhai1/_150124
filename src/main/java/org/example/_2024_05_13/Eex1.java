package org.example._2024_05_13;

public class Eex1 {

    public static void main(String[] args) {
        int a = 11;
        int b = 0;


        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


        System.out.println(a/b);
    }
}