package org.example._2024_03_28;

import java.util.concurrent.locks.ReentrantLock;

public class BankAccount {
    private double balance;
    private final double startBalance = 15_000;
    private static final String DATA_URL = "http://";

    private static final ReentrantLock lock = new ReentrantLock();

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public final void deposit(double amount) {
        lock.lock();
        balance = balance + amount;
        lock.unlock();
    }

    public void withdraw(double amount) {
        lock.lock();
        balance = balance - amount;
        lock.unlock();
    }

    public static void main(String[] args) {
        new BankAccount(100_000).deposit(10_000);
    }
}
