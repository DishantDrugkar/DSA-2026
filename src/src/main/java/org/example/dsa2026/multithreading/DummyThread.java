package org.example.dsa2026.multithreading;

public class DummyThread extends Thread{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
