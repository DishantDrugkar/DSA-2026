package org.example.dsa2026.multithreading;

public class MainThread {
    public static void main(String[] args) {
     DummyThread hello = new DummyThread();
       hello.start();

        // By runnable interface
        RunnableInterface world = new RunnableInterface();
        Thread t1 = new Thread(world);
        t1.start();
        System.out.println(Thread.currentThread().getName());
    }
}
