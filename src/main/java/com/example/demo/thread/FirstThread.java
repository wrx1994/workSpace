package com.example.demo.thread;

public class FirstThread extends Thread {

    public int i = 0;
    private static boolean flag = false;
    @Override
    public void run(){
        while (!flag){
            System.out.println("false");
        }
        System.out.println("退出了");
//        for(;i<10;i++){
//            System.out.println(Thread.currentThread().getName());
        //}
    }

    public static void main(String[] args) throws Exception{
        new FirstThread().start();
        Thread.sleep(5000);
        flag=true;
    }
}
