package org.example._2024_05_19;

/**
 * В классе есть родительский класс. В конструкторе вызывается super и передаются
 * все доступные значения (одно из них возраст).
 * Нужно проверить возраст по определенным критериям и выбросить исключение,
 * если он не подходит под условие.
 * Если ставить if перед super, появляется ошибка "Call to 'super()'
 * must be first statement in constructor body". Как это лучше решить,
 * если от родительского класса наследуются несколько и у всех разные проверки возраста?
 */
public class Sv1 {
    public static void main(String[] args) {

    }
}

class Parent {
    private int age;

    public Parent(int age) {
        this.age = age;
    }
}

class Child extends Parent {

    public Child(int age) {
        super(validateAge(age));
    }

    private static int validateAge(int age) {
        if (age < 18 || age > 60) {
            throw new IllegalArgumentException("Age must be between 18 and 60");
        }
        return age;
    }
}

