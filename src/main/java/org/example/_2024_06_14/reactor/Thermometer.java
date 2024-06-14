package org.example._2024_06_14.reactor;

import lombok.Getter;
import lombok.Setter;

@Setter
public class Thermometer {

    private double temperature;

    @Getter
    private Sensor sensor;

    public double getTemperature() {
        if (sensor.isBlocked()) {
            throw new RuntimeException("Sensor is blocked");
        }
        return temperature;
    }

}