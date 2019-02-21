package com.ghaien.pattern.strategy.basic;

/**
 * 策略B
 *
 * @author guo.haien
 * @date 2019/2/21 16:32
 */
public class StrategyB implements Strategy {

    @Override
    public void algorithm() {
        System.out.println("执行策略B");
    }
}
