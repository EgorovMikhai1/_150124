package org.example._2024_06_21;

public class Vol extends Thread {
    volatile boolean b = true;

    @Override
    public void run() {
        long counter = 0;

        while (b) {
            counter++;
        }

        System.out.println("*****LOOP END*****");
        System.out.println("COUNTER: " + counter);
    }

    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN STARTED");

        Vol v = new Vol();
        v.start();

        Thread.sleep(234);
        System.out.println("MAIN WOKE UP!!");

        v.b = false;
        System.out.println("FALSE!!! " + v.b);
        v.join();

        System.out.println("MAIN FINISHED");
    }
}