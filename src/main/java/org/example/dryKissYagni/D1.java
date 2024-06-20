package org.example.dryKissYagni;

import java.util.List;

public class D1 {


    public double calculateAverageValueForGivenList(List<Double> listOfNumbers) {
        double sumOfAllValues = 0;
        for (double currentValue : listOfNumbers) {
            sumOfAllValues += currentValue;
        }
        return sumOfAllValues / listOfNumbers.size();
    }
}


