package org.example.dsa2026.multithreading;

public class RunnableInterface implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
