package org.example._2024_05_07.testCollection;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class HouseGenerator {
    private static final Random random = new Random();

    public static List<House> generateHouses(int numberOfHouses) {
        List<House> houses = new ArrayList<>();
        for (int i = 0; i < numberOfHouses; i++) {
            House house = new House();
            house.entrance = random.nextInt(10) + 1;
            house.hasElevator = random.nextBoolean();

            List<Flat> flats = new ArrayList<>();
            int floors = random.nextInt(99) + 1;
            int flatsPerFloor = random.nextInt(10) + 1;
            for (int floor = 0; floor < floors; floor++) {
                for (int flatIndex = 0; flatIndex < flatsPerFloor; flatIndex++) {
                    flats.add(generateFlat(floor));
                }
            }
            house.flats = flats;
            houses.add(house);
        }
        return houses;
    }

    private static Flat generateFlat(int floor) {
        Flat flat = new Flat();
        flat.floor = floor;
        flat.flatnumber = random.nextInt(1000);
        int roomsCount = random.nextInt(5) + 1;
        List<Room> rooms = new ArrayList<>();
        double totalSquare = 0;

        for (int i = 0; i < roomsCount; i++) {
            Room room = new Room();
            room.length = random.nextDouble() * 10 + 1;
            room.width = random.nextDouble() * 10 + 1;
            room.height = random.nextDouble() * 3 + 2;
            room.color = Color.values()[random.nextInt(Color.values().length)];
            room.doorway = new Doorway();
            room.doorway.length = Math.min(room.length, room.width) - 0.5;
            room.doorway.height = room.height - 0.5;
            double roomVolume = room.length * room.width * room.height;
            room.boxes = generateBoxes(roomVolume);
            totalSquare += room.length * room.width;
            rooms.add(room);
        }
        flat.roomList = rooms;
        flat.square = totalSquare;
        return flat;
    }

    private static List<Box> generateBoxes(double roomVolume) {
        List<Box> boxes = new ArrayList<>();
        double remainingVolume = roomVolume;
        while (remainingVolume > 0) {
            Box box = new Box();
            box.length = random.nextDouble() * 2 + 0.5;
            box.width = random.nextDouble() * 2 + 0.5;
            box.height = random.nextDouble() * 2 + 0.5;
            box.weight = random.nextDouble() * 10;
            box.color = Color.values()[random.nextInt(Color.values().length)];
            double boxVolume = box.length * box.width * box.height;
            if (boxVolume <= remainingVolume) {
                boxes.add(box);
                remainingVolume -= boxVolume;
            } else {
                break;
            }
        }
        return boxes;
    }

    public static void main(String[] args) {
        List<House> houses = generateHouses(777);
        System.out.println(houses.get(0).hasElevator);
    }
}