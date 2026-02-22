package org.example.dsa2026.multithreading;

public class ThreadLifeCycle extends Thread{
    @Override
    public void run() {
        System.out.println("RUNNING"); // RUNNING
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThreadLifeCycle t1 = new ThreadLifeCycle();  // NEW
        System.out.println(t1.getState());

        t1.start(); // RUNNABLE
        System.out.println(t1.getState());

        Thread.sleep(100); // MAIN THREAD PAUSE, TIME WAITING STATE
        System.out.println(t1.getState());

        t1.join(); // WAITS TO TERMINATE THREAD
        System.out.println(t1.getState());
    }
}
