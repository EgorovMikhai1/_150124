package org.example._2024_06_21;

public class MT2 {
    public static void main(String[] args) {
        System.out.println("MAIN START");

        Thread T_0 = new Thread(new Task());
        Thread T_1 = new Thread(new TaskChar());

        T_0.setName("T_0");
        T_1.setName("T_1");

        T_0.start();
        T_1.start();

        System.out.println("MAIN END");
    }
}

class Task implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            try {

                Thread.sleep(888);
                System.out.println("I: " + i + " NAME: " + Thread.currentThread().getName());

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class TaskChar implements Runnable {

    @Override
    public void run() {
        for (char c = '!'; c <= '~'; c++) {
            try {
                Thread.sleep(444);
                System.out.println("CHAR: " + c + " NAME: " + Thread.currentThread().getName());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}