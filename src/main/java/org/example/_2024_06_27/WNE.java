package org.example._2024_06_27;

public class WNE {
    public static void main(String[] args) {
        Market market = new Market();
        Producer producer = new Producer(market);
        Consumer consumer = new Consumer(market);

        Thread p_Thread = new Thread(producer);
        Thread c_Thread = new Thread(consumer);

        p_Thread.start();
        c_Thread.start();
    }
}

class Market {
    private final Object LOCK = new Object();
    private int breadCounter = 0;

    public void getBread() {
        synchronized (LOCK) {
            while (breadCounter < 1) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(123);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            breadCounter--;
            System.out.println("Cunsumer: " + breadCounter);
            LOCK.notify();
        }
    }

    public void putBread() {
        synchronized (LOCK) {
            while (breadCounter >= 5) {
                try {
                    LOCK.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            try {
                Thread.sleep(234);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            breadCounter++;
            System.out.println("Producer: " + breadCounter);
            LOCK.notify();
        }

    }
}

class Producer implements Runnable {
    private Market market;

    public Producer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.putBread();
        }
    }
}

class Consumer implements Runnable {
    private Market market;

    public Consumer(Market market) {
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            market.getBread();
        }
    }
}