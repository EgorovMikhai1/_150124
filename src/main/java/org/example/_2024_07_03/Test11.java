package org.example._2024_07_03;

import java.util.Arrays;
import java.util.List;

public class Test11 {

}

class Chicken {
}

interface HenHouse {
    List<Chicken> getChickens();
}

class ChickenSong {
    public static void main(String[] args) {
        HenHouse house = new HenHouse() {
            @Override
            public List<Chicken> getChickens() {
                return Arrays.asList();
            }
        };

        Chicken chicken = house.getChickens().get(0);
        for (int i = 0; i < house.getChickens().size();
             chicken = house.getChickens().get(i++)) {
            System.out.println("Cluck");
        }
    }
}