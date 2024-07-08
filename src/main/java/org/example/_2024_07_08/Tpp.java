package org.example._2024_07_08;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Tpp {
    public static void main(String[] args) {
        ExecutorService es1 = Executors.newFixedThreadPool(7);
//        ExecutorService es1 = Executors.newCachedThreadPool();
//        ExecutorService es1 = Executors.newSingleThreadExecutor();
//        ExecutorService es1 = Executors.newScheduledThreadPool();

//        for (int i = 0; i < 25; i++) {
//            final int j = i;
//
//            es1.submit(() -> System.out.println("TASK: " + j + " | " + Thread.currentThread().getName()));
//        }
//
//        es1.shutdown();
    }
}
