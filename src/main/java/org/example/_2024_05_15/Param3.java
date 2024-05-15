package org.example._2024_05_15;

import java.util.Arrays;
import java.util.List;

public class Param3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AS", "YT", "LK");
        System.out.println(Display.getEl(list));
    }
}


class Display {
    public static <T> T getEl(List<T> list) {
        return list.get(0);
    }
}

//class T {
//
//}