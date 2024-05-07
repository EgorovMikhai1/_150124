package org.example._2024_05_07.testCollection;

import java.util.*;

public class HouseCollectionTasks_1 {
    
    // Задание 1: Вернуть список всех квартир во всех домах (List)
    public static List<Flat> getAllFlats(List<House> houses) {
        List<Flat> allFlats = new ArrayList<>();

        return allFlats;
    }

    // Задание 2: Вернуть множество всех уникальных цветов, используемых в комнатах квартир (Set)
    public static Set<Color> getUniqueRoomColors(List<House> houses) {
        Set<Color> colors = new HashSet<>();

        return colors;
    }

    // Задание 3: Вернуть карту, ключами которой являются номера этажей, а значениями - количество квартир на этом этаже (Map)
    public static Map<Integer, Integer> getFlatsCountByFloor(House houses) {
        Map<Integer, Integer> floorMap = new HashMap<>();

        return floorMap;
    }

    // Задание 4: Используя очередь, вернуть список номеров квартир в порядке, в котором они появляются, начиная с первого подъезда (Queue)
    public static List<Integer> getFlatNumbersInOrder(House houses) {
        Queue<Integer> queue = new LinkedList<>();
        List<Integer> orderedFlatNumbers = new ArrayList<>();

        return orderedFlatNumbers;
    }

    // Задание 5: Используя стек, вернуть список всех квартир в обратном порядке от последнего дома к первому (Stack)
    public static List<Flat> getFlatsInReverseOrder(House houses) {
        Stack<Flat> stack = new Stack<>();
        List<Flat> reversedFlats = new ArrayList<>();

        return reversedFlats;
    }
    
    public static void main(String[] args) {
        List<House> houses = HouseGenerator.generateHouses(777);

        System.out.println("Все квартиры: " + getAllFlats(houses).size());
        System.out.println("Уникальные цвета комнат: " + getUniqueRoomColors(houses).size());
        System.out.println("Квартиры по этажам: " + getFlatsCountByFloor(houses.get(0)));
        System.out.println("Номера квартир по порядку: " + getFlatNumbersInOrder(houses.get(0)));
        System.out.println("Квартиры в обратном порядке: " + getFlatsInReverseOrder(houses.get(0)));
    }
}
