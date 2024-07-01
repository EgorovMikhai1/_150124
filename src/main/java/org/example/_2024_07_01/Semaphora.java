package org.example._2024_07_01;

import com.github.javafaker.Faker;
import lombok.Getter;

import java.util.concurrent.Semaphore;

public class Semaphora {
    private static final Faker FAKER = new Faker();

    public static void main(String[] args) {
        Semaphore semaphore = new Semaphore(3);

        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
        new P1(FAKER.name().name(), semaphore);
    }
}


class P1 extends Thread {

    private String name;
    private Semaphore semaphore;
    private int counter = 0;

    public P1(String name, Semaphore semaphore) {
        this.name = name;
        this.semaphore = semaphore;
        this.start();
    }

    public synchronized void increase() {
        counter++;
    }

    @Override
    public void run() {
//50
        try {
            System.out.println(name + ": is waiting for .... ... .. .  .   .");
            semaphore.acquire();
//++
            System.out.println(name + ": is using the callBox");
            sleep(2345);
//10
            System.out.println(name + ": stop to use");
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            semaphore.release();
//--
        }
    }
}