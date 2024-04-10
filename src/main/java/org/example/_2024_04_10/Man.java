package org.example._2024_04_10;

import com.github.javafaker.Faker;

public class Man {
    String name;
    Skate skate;

    public Man(String name, Skate skate) {
        this.name = name;
        this.skate = skate;
    }
}

class Skate {
    String  name;

    public Skate(String name) {
        this.name = name;
    }
}

class Main {

    public Man[] generateManArray10(int nMan) {
        Man[] men = new Man[nMan];
        Faker faker = new Faker();


        for (int i = 0; i < men.length; i++) {
            men[i] = new Man(faker.funnyName().name(), new Skate(faker.funnyName().name()));
        }

        return men;
    }


    public static void main(String[] args) {
        Man man = new Man("Name", new Skate("Skate"));
    }
}