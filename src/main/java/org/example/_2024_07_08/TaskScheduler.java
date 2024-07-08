package org.example._2024_07_08;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskScheduler {
    private final ScheduledExecutorService scheduler;

    public TaskScheduler() {
        this.scheduler = Executors.newScheduledThreadPool(2);
    }

    public void scheduledTask(Runnable task, final long delay, final TimeUnit unit) {
        scheduler.schedule(task, delay, unit);
    }

    public void shutdown() {
        scheduler.shutdown();
    }

    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.scheduledTask(()-> System.out.println("***BREAK END***"), 18, TimeUnit.MINUTES);
        scheduler.shutdown();
    }
}