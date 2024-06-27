package org.example._2024_06_26;

public class DaemonEx {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("MAIN START");

        UserThread userThread = new UserThread();
        DaemonThread daemonThread = new DaemonThread();

        userThread.setName("USER_T");
        daemonThread.setName("DAEM_R");

        daemonThread.setDaemon(true);

        userThread.start();
        daemonThread.start();

        userThread.join();
        daemonThread.join();

        System.out.println("MAIN END");
    }
}

class UserThread extends Thread {

    @Override
    public void run() {
        System.out.println("THREAD_NAME: " + Thread.currentThread().getName());
        System.out.println("IS DAEMON: " + Thread.currentThread().isDaemon());

        for (char c = 'a'; c < 'z'; c++) {
            try {
                Thread.sleep(222);
                System.out.println("CHAR: " + c);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class DaemonThread extends Thread {
    @Override
    public void run() {
        System.out.println("THREAD_NAME: " + Thread.currentThread().getName());
        System.out.println("IS DAEMON: " + Thread.currentThread().isDaemon());

        for (int i = 0; i < 100_000; i++) {
            try {
                Thread.sleep(444);
                System.out.println("I: " + i);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}