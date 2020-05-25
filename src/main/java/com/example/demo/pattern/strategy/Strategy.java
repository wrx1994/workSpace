package com.example.demo.pattern.strategy;

/**
 * 定义抽象策略角色
 */
public interface Strategy {

    /**
     *  基础方法-策略方法
     * @param num1
     * @param num2
     * @return
     */
     int calc(int num1,int num2);
}
