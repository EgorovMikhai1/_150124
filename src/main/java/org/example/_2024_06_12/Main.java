package org.example._2024_06_12;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;


public class Main {

    public void get(@Info(description = "Это стринга") String s) {
        System.out.println(s);
    }

    public static void main(String[] args) {

    }

    @Override
    public String toString() {
        return "Main{}";
    }
}

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String description() default "";
}