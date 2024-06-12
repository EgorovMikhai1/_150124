package org.example._2024_06_12.taski;

/**
 * Класс, который выполняет расчет налогов на основе дохода и статуса налогоплательщика.
 */
public class TaxCalculator {

    public static double calculateTax(double income, String status) {
        if (income < 0 || (!status.equals("single") && !status.equals("married"))) {
            throw new IllegalArgumentException("Invalid input values.");
        }

        double taxRate;
        if (status.equals("single")) {
            taxRate = (income <= 50000) ? 0.2 : 0.25;
        } else {
            taxRate = (income <= 80000) ? 0.15 : 0.20;
        }

        return income * taxRate;
    }
}