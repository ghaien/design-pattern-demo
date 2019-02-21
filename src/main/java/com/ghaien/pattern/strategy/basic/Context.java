package com.ghaien.pattern.strategy.basic;

/**
 * 上下文，维护一个策略对象
 *
 * @author guo.haien
 * @date 2019/2/21 16:33
 */
public class Context {

    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    /**
     * 执行策略的算法
     */
    public void doAlgorithm() {
        strategy.algorithm();
    }
}
