package org.example._2024_04_22;

import lombok.*;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class House implements Comparable<House> {

    private String name;
    private int floors;
    private int flats;

    @Override
    public int compareTo(House o) {
//        int flatsResult = this.flats - o.getFlats();
//        if (flatsResult == 0) {
//            return this.floors - o.floors;
//        }
        return this.name.compareTo(o.name);
    }
}

class HouseReversedOrderComparator implements Comparator<House> {


    @Override
    public int compare(House o1, House o2) {
        return o2.compareTo(o1);
    }
}

class Main {
    public static void main(String[] args) {
        Map<House, Double> map = new TreeMap<>();
        map.put(new House("H1", 3, 10), 1564.25);
        map.put(new House("H2", 5, 14), 2564.25);
        map.put(new House("H3", 4, 12), 2264.25);
        map.put(new House("H4", 1, 2), 564.25);
        map.put(null, null);
        map.put(null, 123.2);
        map.put(new House(), null);


        System.out.println(map);
    }
}