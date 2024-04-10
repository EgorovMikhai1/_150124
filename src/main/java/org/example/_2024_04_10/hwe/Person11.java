package org.example._2024_04_10.hwe;

public class Person11 {

    private String name;
    private Address address;
}


class Address {
    private Country country;

    public static void main(String[] args) {
        Country USA = Country.USA;
    }
}

enum Country {
    USA,
    SPAIN,
    UKRAINE,
    NEW_ZEALAND
}