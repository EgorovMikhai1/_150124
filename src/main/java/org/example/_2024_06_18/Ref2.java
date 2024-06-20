package org.example._2024_06_18;

import java.lang.reflect.Field;

public class Ref2 {
    public static void main(String[] args) throws IllegalAccessException, NoSuchFieldException, InterruptedException {
        Human human = new Human(1, "W", "dep");

        Thread.sleep(15000);
        Class clazz = human.getClass();

        Field field = clazz.getDeclaredField("salary");
        field.setAccessible(true);

        double setSalary = (double) field.get(human);
        field.set(human, setSalary + 10000);
        System.out.println(human);
    }
}