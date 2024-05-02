package org.example._2024_05_02;

import com.github.javafaker.Faker;

import java.util.concurrent.ArrayBlockingQueue;

public class BQueue {
    private static final Faker FAKER = new Faker();
    public static void main(String[] args) {
        ArrayBlockingQueue<String> queue = new ArrayBlockingQueue<>(4);

        Thread producer = new Thread(() ->
        {
            String[] words = {
                    FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name(),
            FAKER.name().name()};

            for (int i = 0; i < words.length && !Thread.interrupted(); i++) {
                try {
                    Thread.sleep(500);
                    queue.put(words[i]);
                    System.out.println(
                            "Producer put: " + words[i] + " NUMBERS: " + queue.size()
                    );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }

        });

        Thread consumer = new Thread(() ->
        {
            StringBuilder builder = new StringBuilder();
            while (!Thread.interrupted()) {

                try {
                    builder.setLength(0);
                    Thread.sleep(5000);
                    builder.append(queue.take());
                    System.out.println(
                            "Consumer got: " + builder.reverse() + " NUMBERS: " + queue.size()
                    );
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        producer.start();
        consumer.start();

    }
}
