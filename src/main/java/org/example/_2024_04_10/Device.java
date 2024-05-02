package org.example._2024_04_10;

import com.github.javafaker.Cat;
import com.github.javafaker.Faker;

public abstract class Device extends Cat {


    String name;

    protected Device(Faker faker) {
        super(faker);
    }

    abstract boolean isConnected(String port);
}

abstract class MobilePhone extends Device {

    protected MobilePhone(Faker faker) {
        super(faker);
    }
}

class AndroidPhone extends MobilePhone {

    protected AndroidPhone(Faker faker) {
        super(faker);
    }

    @Override
    boolean isConnected(String port) {
        return false;
    }
}

class Iphone extends MobilePhone {

    protected Iphone(Faker faker) {
        super(faker);
    }

    @Override
    boolean isConnected(String port) {
        return false;
    }
}

class Keyboard extends Device {

    protected Keyboard(Faker faker) {
        super(faker);
    }

    @Override
    boolean isConnected(String port) {
        return false;
    }
}