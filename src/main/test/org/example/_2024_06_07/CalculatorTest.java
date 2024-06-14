package org.example._2024_06_07;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    private final Calculator calculator = new Calculator();
    private final double a = 10;
    private final double b = 20;
    private final double bZero = 0;


    @Test
    void dividePositiveTest() {
        double expected = 0.5d;
        Assertions.assertEquals(expected, calculator.divide(a, b), 0.001);
    }

    @Test
    void divideWithExceptionTest() {
        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(a, bZero));
    }
}