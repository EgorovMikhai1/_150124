package org.example._2024_05_07.testCollection;

import java.util.*;

public class MoreAdvancedHouseCollectionTasks {

    // Задание 1: Вернуть количество домов, в которых есть квартиры площадью более 100 кв. м (List)
    public static int countHousesWithLargeFlats(List<House> houses) {
        int count = 0;

        return count;
    }

    // Задание 2: Вернуть список всех дверных проемов в домах, где есть лифт (List)
    public static List<Doorway> getDoorwaysInElevatorHouses(List<House> houses) {
        List<Doorway> doorways = new ArrayList<>();

        return doorways;
    }

    // Задание 3: Вернуть список всех цветов коробок в домах без лифта (Set)
    public static Set<Color> getBoxColorsInNonElevatorHouses(List<House> houses) {
        Set<Color> colors = new HashSet<>();

        return colors;
    }

    // Задание 4: Вернуть общее количество комнат на последнем этаже всех домов (List)
    public static int getTotalRoomsOnTopFloors(List<House> houses) {
        int totalRooms = 0;

        return totalRooms;
    }

    // Задание 5: Подсчитать суммарное количество комнат в квартирах, окрашенных в определенный цвет (Map)
    public static Map<Color, Integer> countRoomsByColor(List<House> houses) {
        Map<Color, Integer> roomColorCounts = new HashMap<>();

        return roomColorCounts;
    }

    public static void main(String[] args) {
        List<House> houses = HouseGenerator.generateHouses(777);

        System.out.println("Дома с квартирами более 100 кв. м: " + countHousesWithLargeFlats(houses));
        System.out.println("Дверные проемы в домах с лифтом: " + getDoorwaysInElevatorHouses(houses));
        System.out.println("Цвета коробок в домах без лифта: " + getBoxColorsInNonElevatorHouses(houses));
        System.out.println("Комнаты на последних этажах: " + getTotalRoomsOnTopFloors(houses));
        System.out.println("Комнаты по цветам: " + countRoomsByColor(houses));
    }
}
