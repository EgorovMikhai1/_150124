package org.example._2024_06_28;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class LockEx {
    public static void main(String[] args) {
        Call call = new Call();

        Thread mobT = new Thread(call::mC);
        Thread waT = new Thread(call::wA);
        Thread skypeT = new Thread(call::skype);

        mobT.start();
        waT.start();
        skypeT.start();
    }
}

class Call {
    private Lock lock = new ReentrantLock();

    void mC() {
        lock.lock();
        try {
            System.out.println("--Mob call start--");
            Thread.sleep(1234);
            System.out.println("**Mob call end**");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void wA() {
        lock.lock();
        try {
            System.out.println("--WA call start--");
            Thread.sleep(2345);
            System.out.println("**WA call end**");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }

    void skype() {
        lock.lock();
        try {
            System.out.println("--Skype call start--");
            Thread.sleep(3456);
            System.out.println("**Skype call end**");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            lock.unlock();
        }
    }
}