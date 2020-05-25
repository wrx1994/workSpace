package com.example.demo.thread;

public class TwoThread implements Runnable {
     int i=0;
    @Override
    public void run() {
        for (;i<10;i++){
            System.out.println(Thread.currentThread().getName()+"#"+i);
        }
    }

    public static void main(String[] args) {
        TwoThread th = new TwoThread();
        new Thread(th,"一").start();
        new Thread(th,"二").start();
    }
}
