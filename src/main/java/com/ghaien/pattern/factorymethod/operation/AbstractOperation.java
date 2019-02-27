package com.ghaien.pattern.factorymethod.operation;

/**
 * 运算抽象类
 *
 * @author guo.haien
 * @date 2019/2/27 13:27
 */
public abstract class AbstractOperation {

    protected double numberA;

    protected double numberB;

    public double getNumberA() {
        return numberA;
    }

    public void setNumberA(double numberA) {
        this.numberA = numberA;
    }

    public double getNumberB() {
        return numberB;
    }

    public void setNumberB(double numberB) {
        this.numberB = numberB;
    }

    /**
     * 获取计算结果
     *
     * @return 结果
     */
    public abstract double getResult();
}
