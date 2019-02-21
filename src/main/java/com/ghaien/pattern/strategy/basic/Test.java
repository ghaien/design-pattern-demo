package com.ghaien.pattern.strategy.basic;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/21 16:38
 */
public class Test {

    public static void main(String[] args) {
        Context context = new Context(new StrategyA());
        context.doAlgorithm();

        context = new Context(new StrategyB());
        context.doAlgorithm();

        context = new Context(new StrategyC());
        context.doAlgorithm();
    }
}
