package org.example._2024_07_03;

public class FeedingSchedule {
    public static void main(String[] args) {
        int x = 5, j = 0;
        for (int i = 0; i < 3; )
            do {
                i++;
                x++;
                if (x > 10) break;
                x += 4;
                j++;
            } while (j <= 2);
        System.out.println(x);
    }
}