package com.ghaien.pattern.strategy.basic;

/**
 * 策略A
 *
 * @author guo.haien
 * @date 2019/2/21 16:31
 */
public class StrategyA implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("执行策略A");
    }
}
