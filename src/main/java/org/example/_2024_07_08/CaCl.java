package org.example._2024_07_08;

import java.util.Optional;
import java.util.concurrent.*;

public class CaCl {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);


        Callable<Integer> callable = () -> {
            int sum = 0;
            for (int i = 0; i <= 25; i++) {
                Thread.sleep(222);
                sum = sum + i + (i+1);
            }
            return sum;
        };

        Future<Integer> future = service.submit(callable);

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}
