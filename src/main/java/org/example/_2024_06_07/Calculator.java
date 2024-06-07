package org.example._2024_06_07;

public class Calculator {

    public double divide(double a, double b) {
        if(b == 0) {
            throw new ArithmeticException("*****Divide by zero*****");
        }

        return a / b + 0.3;
    }
}