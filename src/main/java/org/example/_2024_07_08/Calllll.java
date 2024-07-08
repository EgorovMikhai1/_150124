package org.example._2024_07_08;

import java.util.concurrent.*;

public class Calllll implements Callable<Integer> {

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 0; i <= 25; i++) {
            Thread.sleep(222);
            sum = sum + i + (i+1);
            System.out.println("SUM: " + sum + " || " + Thread.currentThread().getName());
        }
        return sum;
    }


}

class Main {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(2);
        Calllll calllll = new Calllll();

        Future<Integer> future = service.submit(new Calllll());

        try {
            Integer integer = future.get();
            System.out.println(integer);
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        service.shutdown();
    }
}