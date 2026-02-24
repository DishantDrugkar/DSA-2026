package org.example.dsa2026.multithreading.synchronization;

public class Counter {
    int counter = 0;

    public void increment(){
        synchronized (this) {
            counter++;
        }
    }

    public int getCounter(){
        return counter;
    }
}
