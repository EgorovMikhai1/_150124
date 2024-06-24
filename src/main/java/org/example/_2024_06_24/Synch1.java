package org.example._2024_06_24;

public class Synch1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");
        Implementation impl = new Implementation();

        Thread t1 = new Thread(impl);
        Thread t2 = new Thread(impl);
        Thread t3 = new Thread(impl);

        t1.setName("T1");
        t2.setName("T2");
        t3.setName("T3");

        t1.start();
        t2.start();
        t3.start();

        t1.join();
        t2.join();
        t3.join();

        System.out.println("MAIN END");
    }
}

class Counter {
    static int count = 0;
}

class Implementation implements Runnable {

    void increment() throws InterruptedException {
        Thread.sleep(2222);

        synchronized (this) {
            Counter.count++;
            System.out.println("Counter: " + Counter.count + " : " + Thread.currentThread().getName());
        }
    }

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                //t1 t2 t3
                increment();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}