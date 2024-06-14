package org.example;

import lombok.Getter;

import java.util.HashMap;


public class Do1 {

    @Getter
    private String s ;

    public static void main(String[] args) {

        new HashMap<>();
    }

    @Override
    public String toString() {
        return "Do1{" +
                "s='" + s + '\'' +
                '}';
    }
}
