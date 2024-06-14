package org.example._2024_06_14.reactor;

import lombok.Getter;

@Getter
public class Sensor {
    private boolean blocked;

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }
}