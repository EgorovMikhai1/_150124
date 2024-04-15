package org.example._2024_04_15;

import java.util.List;

public class CoEx2 {
    public int getSumA(int[] arr) {
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }

    public int getSumL(List<Integer> list) {
        int sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum;
    }


}
