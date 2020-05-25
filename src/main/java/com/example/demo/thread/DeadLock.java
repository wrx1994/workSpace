package com.example.demo.thread;

public class DeadLock implements Runnable{
    boolean result ;
    static Object oA = new Object();
    static Object oB = new Object();
    public DeadLock(boolean result){
        this.result = result;
    }
    @Override
    public void run() {
        if(result){
            synchronized (oA){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (oB){
                    System.out.println("oB");
                }
            }
        }
        if(!result){
            synchronized (oB){
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (oA){
                    System.out.println("oA");
                }
            }
        }
    }
}
