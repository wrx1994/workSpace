package com.example.demo.thread;


public class DeadLockThread  {
    public static void main(String[] args) {
        Thread tA = new Thread(new DeadLock(true));
        Thread tB = new Thread(new DeadLock(false));
        tA.start();
        tB.start();
    }
}
