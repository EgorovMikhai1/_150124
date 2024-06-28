package org.example._2024_06_27;

import java.util.Iterator;
import java.util.concurrent.ConcurrentHashMap;

public class Chm {
    public static void main(String[] args) throws InterruptedException {
        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();

        map.put(1, "AAA");
        map.put(2, "AQ");
        map.put(3, "QS");
        map.put(44, "QF");
        map.put(5, "QV");

        Runnable runnable1 = () -> {
            Iterator<Integer> iterator = map.keySet().iterator();
            while (iterator.hasNext()) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                Integer i = iterator.next();
                System.out.println(i  + " : " + map.get(i));
            }
        };

        Runnable runnable2 = () -> {
            try {
                Thread.sleep(333);
                map.put(11, "!!!!");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Thread t1 = new Thread(runnable1);
        Thread t2 = new Thread(runnable2);

        t1.start();
        t2.start();

        t1.join();
        t2.join();

        System.out.println(map);

    }
}
