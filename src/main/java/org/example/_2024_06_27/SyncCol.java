package org.example._2024_06_27;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class SyncCol {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < 4; i++) {
            integers.add(new Random().nextInt(10));
        }

        List<Integer> target = Collections.synchronizedList(new ArrayList<>());

        Runnable runnable = () -> target.addAll(integers);

        Thread thread = new Thread(runnable);
        Thread thread2 = new Thread(runnable);

        thread.start();
        thread2.start();

        try {
            thread2.join();
            thread.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        System.out.println(target);
    }
}
