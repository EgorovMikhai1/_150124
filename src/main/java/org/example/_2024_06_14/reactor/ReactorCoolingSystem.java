package org.example._2024_06_14.reactor;

import lombok.Getter;
import lombok.Setter;

public class ReactorCoolingSystem {

    @Setter
    private Thermometer thermometer;

    @Setter
    private double temperatureThreshold;

    @Getter
    private boolean on;

    public ReactorCoolingSystem() {
        on = false;
    }

    public void checkReactorCoolingSystem() {
        this.on = (thermometer.getTemperature() >= temperatureThreshold);
    }
}