package org.example._2024_04_08;

import java.io.Serializable;

public class Vehicle implements Runnable {
    /**
     * When an object implementing interface {@code Runnable} is used
     * to create a thread, starting the thread causes the object's
     * {@code run} method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method {@code run} is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }

    public static void getVAR(String... string) {

    }

    public static void main(String[] args) {
        getVAR("w", "sd", "jj", "uuuu");
    }
}

class Auto implements FlyAble {

    @Override
    public void fly() {
        System.out.println("1500 m");
    }
}

class MiniCar implements FlyAble, SwimAble {

    @Override
    public void fly() {
        System.out.println("15000 m");
    }

}


interface FlyAble {
    void fly();
}

interface SwimAble {
    void fly();
}