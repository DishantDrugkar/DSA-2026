package org.example.dsa2026.multithreading.practice;

public class MyThread extends Thread{
    @Override
    public void run() {
       // System.out.println(Thread.currentThread().getName());
        System.out.println("RUNNING");
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        MyThread t1 = new MyThread();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(100);
        System.out.println(t1.getState());
        t1.join();
        System.out.println(t1.getState());
    }
}
