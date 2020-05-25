package com.example.demo.pattern.strategy;


import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Map map = new ConcurrentHashMap(16);
        StrategyControl context = new StrategyControl(new AddStrategy());
        System.out.println("10 + 5 = " + context.calc(10, 5));

        context = new StrategyControl(new SubtractStrategy());
        System.out.println("10 - 5 = " + context.calc(10, 5));
    }
}
