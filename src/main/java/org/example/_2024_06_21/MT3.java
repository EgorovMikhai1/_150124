package org.example._2024_06_21;

public class MT3 {
    public static void main(String[] args) {
        new Thread(() -> {
            for (int i = 0; i < 10; i++) {
                System.out.println(i);
            }
        }).start();
    }
}
