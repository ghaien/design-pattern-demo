package com.ghaien.pattern.easyfactory.operation;

/**
 * 减法运算
 *
 * @author guo.haien
 * @date 2019/2/21 14:41
 */
public class OperationSub extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA - numberB;
    }
}
