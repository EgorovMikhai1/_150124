package org.example._2024_06_26;

public class Interup {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        Example exampleThread = new Example();
        System.out.println("NEW OBJECT 8: " + exampleThread.getState());
        exampleThread.setPriority(10);

        exampleThread.start();
        System.out.println("NEW OBJECT 12: " + exampleThread.getState());
        exampleThread.sleep(2222);
        System.out.println("NEW OBJECT 14: " + exampleThread.getState());
        exampleThread.interrupt();

        System.out.println("NEW OBJECT 17: " + exampleThread.getState());
        exampleThread.join();
        System.out.println("MAIN END");
    }
}

class Example extends Thread {
    double s = 0;

    @Override
    public void run() {
        for (int i = 0; i < 100_000_000; i++) {
            if(isInterrupted()) {
                System.out.println("INTERRUPTED: " + Thread.currentThread().getName());
                return;
            }

            s = s + Math.sqrt(i);

            try {
                sleep(100);
            } catch (InterruptedException e) {
                System.out.println("INTERRUPTED WHILE SLEEPING");
                return;
            }
        }

        System.out.println(s);
    }
}