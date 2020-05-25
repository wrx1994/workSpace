package com.example.demo.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

public class CallableThread implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for (int i = 1; i < 11; i++) {
            sum += i;
        }
        System.out.println(Thread.currentThread().getName() + " is running: " + sum);
        return sum;
    }

    public static void main(String[] args) {
        CallableThread ct = new CallableThread();
        FutureTask<Integer> ft = new FutureTask<>(ct);
        new Thread(ft).start();
        try {
            System.out.println("返回值"+ft.get());
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
