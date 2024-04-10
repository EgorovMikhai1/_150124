package org.example._2024_04_10.example;

import lombok.NonNull;

public class ExampleI {

    /**
     *
     * @param animal input parameter
     */
    public static void get(@NonNull InterEx animal) {

    }

    public static void main(String[] args) {
        get(new Animal());
        InterEx interEx = new Animal();
        InterEx.getINTER();
    }
}
