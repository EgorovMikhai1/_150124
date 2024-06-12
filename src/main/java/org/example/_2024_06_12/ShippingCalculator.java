package org.example._2024_06_12;

public class ShippingCalculator {
    public static double calculateShippingCost(double weight, double distance) {
        if(weight <= 0 || distance <= 0) {
            throw new IllegalArgumentException("Weight and distance must be greater than 0");
        }

        double baseCost = 5.0d;
        double weightFactor = 1.2d;
        double distanceFactor = 0.5d;

        return baseCost + (weightFactor * weight) + (distanceFactor * distance);
    }
}