package org.example._2024_04_10.example2;

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class House {
    private String streetName;
    private int flatNumber;
    private Flat[] flats;
}

@Getter
class Flat {
    private int number;
    private Room[] rooms;
}

@Getter
class Room {
    int w;
    int l;
    int h;
}

class Testt {
//    public Room[] getRoomsByVolume(House[] houses, double volume) {
//        List<Room> roomList = new ArrayList<>();
//
//        for (int i = 0; i < houses.length; i++) {
//            House house = houses[i];
//            Flat[] flats = house.getFlats();
//            for (int j = 0; j < flats.length; j++) {
//                if(flats[i])
//            }
//        }
//    }
}
