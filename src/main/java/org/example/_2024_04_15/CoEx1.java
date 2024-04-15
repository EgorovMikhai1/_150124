package org.example._2024_04_15;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class CoEx1 {
    public static void main(String[] args) {
     //   List<String> == String[]
     //   List<String> al = new ArrayList<>();
        List<Boolean> alI = new ArrayList<>(10_000);
        List<String> al = new LinkedList<>();

        al.add("WE");
        al.add("YT");
        al.add("LO");
        al.add("IU");
        al.add("VB");
        al.add("VB");
        al.add("VB2");
        al.add("VB");
        al.add("FG");
        al.add("VB");
        al.add("VB");
        al.add("PP");
        al.add("V8B");

        for (String s : al) {
            System.out.println("FOR: " + s);
        }
        System.out.println("*****************************************************");

        System.out.println(al);
        System.out.println("SIZE: " + al.size());
        System.out.println("IS contain PP1: " + al.contains("PP1"));

        System.out.println("IS EMPTY: " + al.isEmpty());

        System.out.println(al.get(5));
    }
}
