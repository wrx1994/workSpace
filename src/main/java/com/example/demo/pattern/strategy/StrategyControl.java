package com.example.demo.pattern.strategy;


public class StrategyControl  implements Strategy{

    private Strategy strategy;

    public  StrategyControl(Strategy strategy){
        this.strategy = strategy;
    }
    @Override
    public int calc(int num1, int num2){
       return strategy.calc(num1,num2);
    }
}
