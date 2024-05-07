package org.example._2024_05_07.testCollection;

import lombok.ToString;

import java.util.List;

@ToString
public class House {

    List<Flat> flats;
    int entrance;
    boolean hasElevator;
}


class Flat {
    List<Room> roomList;
    double square;
    int flatnumber;
    int floor;

    @Override
    public String toString() {
        return "Flat[" +
                "ROOMS: " + roomList.size() +
                ", SQUARE: " + square +
                ", FLAT NUMBER: " + flatnumber +
                ", FLOOR: " + floor +
                ']';
    }
}

class Room {
    double length;
    double width;
    double height;
    Doorway doorway;
    List<Box> boxes;
    Color color;

    @Override
    public String toString() {
        return "Room[" +
                "L: " + length +
                ", W: " + width +
                ", H: " + height +
                ", DOORWAY: " + doorway +
                ", BOXES SIZE: " + boxes.size() +
                ", COLOR: " + color +
                ']';
    }
}

class Doorway {
    double length;
    double height;

    @Override
    public String toString() {
        return "Doorway[" +
                " L: " + length +
                ", H: " + height +
                ']';
    }
}

@ToString
enum Color {
    WHITE, BLACK, GREEN, YELLOW, RED, BLUE, PURPLE, BRAUN;
}


class Box {
    double length;
    double width;
    double height;
    double weight;
    Color color;

    @Override
    public String toString() {
        return "Box[" +
                "L: " + length +
                ", W: " + width +
                ", H: " + height +
                ", WEIGHT: " + weight +
                ", COLOR: " + color +
                ']';
    }
}

class Main {
    public static void main(String[] args) {

    }
}