package org.example.dsa2026.multithreading.synchronization;

public class BankAccount {
    private int balance = 100;

    public void withdraw(int amount){
        System.out.println(Thread.currentThread().getName());
    }
}
