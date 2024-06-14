package org.example._2024_06_14.proxy;

public interface DriveAble {
    void start();
    void stop();
}

class Car implements DriveAble {

    @Override
    public void start() {
        System.out.println("REAL car start");
    }

    @Override
    public void stop() {
        System.out.println("REAL car stop");
    }
}

class CarProxy implements DriveAble {
    private Car car;

    public CarProxy(Car car) {
        this.car = car;
    }

    @Override
    public void start() {
        System.out.println("PROXY car start");
    }

    @Override
    public void stop() {
        System.out.println("PROXY car stop");
    }
}

class Main {
    public static void main(String[] args) {
        Car car = new Car();
        CarProxy carProxy = new CarProxy(car);

        carProxy.start();
    }
}
