package org.example._2024_03_28;

import com.github.javafaker.Faker;
import lombok.ToString;

@ToString
public class Team {
    String name;
    String city;

    public Team(String name, String city) {
        this.name = name;
        this.city = city;
    }

    public static void main(String[] args) {
        Faker faker = new Faker();

        for (int i = 0; i < 5; i++) {
            System.out.println(new Team(faker.funnyName().name(), faker.address().city()));
        }
    }
}