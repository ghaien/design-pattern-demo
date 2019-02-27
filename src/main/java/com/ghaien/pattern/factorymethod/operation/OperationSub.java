package com.ghaien.pattern.factorymethod.operation;

/**
 * 减法运算类
 *
 * @author guo.haien
 * @date 2019/2/27 13:29
 */
public class OperationSub extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
