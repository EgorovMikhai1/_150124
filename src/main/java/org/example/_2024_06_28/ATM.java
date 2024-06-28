package org.example._2024_06_28;

import com.github.javafaker.Faker;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ATM {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {

        Lock lock = new ReentrantLock();

        new Human(FAKER.name().name(), lock);
        new Human(FAKER.name().name(), lock);
        new Human(FAKER.name().name(), lock);
        new Human(FAKER.name().name(), lock);
        new Human(FAKER.name().name(), lock);
        new Human(FAKER.name().name(), lock);
    }
}

class Human extends Thread {
    private String name;
    private Lock lock;

    public Human(String name, Lock lock) {
        this.name = name;
        this.lock = lock;
        this.start();
    }

    @Override
    public void run() {
        if (lock.tryLock()) {
            try {
//            System.out.println(name + ": Waiting for ATM.... ... .. .  .   .");
//            lock.lock();
                System.out.println(name + ": using....");
                Thread.sleep(555);
                System.out.println(name + ": DONE!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } finally {
                lock.unlock();
            }
        } else {
            System.out.println(name + ": decided to go away((");
        }
    }
}