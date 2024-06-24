package org.example._2024_06_24;

public class Box {
    private static final Object LOCK = new Object();

    void mobile() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("MOBILE CALL START");
            Thread.sleep(4444);
            System.out.println("MOBILE CALL END");
        }
    }

    void wa() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("WA CALL START");
            Thread.sleep(3456);
            System.out.println("WA CALL END");
        }
    }

    void tel() throws InterruptedException {
        synchronized (LOCK) {
            System.out.println("TELEGRAM CALL START");
            Thread.sleep(2345);
            System.out.println("TELEGRAM CALL END");
        }
    }

    public static void main(String[] args) {
        Thread mobT = new Thread(new Mob());
        Thread waT = new Thread(new Wa());
        Thread tT = new Thread(new Tel());

        mobT.setName("Mob_Thread");
        waT.setName("Wa_Thread");
        tT.setName("Tel_Thread");

        mobT.start();
        waT.start();
        tT.start();
    }
}

class Mob implements Runnable {

    @Override
    public void run() {
        try {
            new Box().mobile();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Wa implements Runnable {

    @Override
    public void run() {
        try {
            new Box().wa();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Tel implements Runnable {

    @Override
    public void run() {
        try {
            new Box().tel();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}