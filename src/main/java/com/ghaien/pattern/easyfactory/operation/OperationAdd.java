package com.ghaien.pattern.easyfactory.operation;

/**
 * 加法运算
 *
 * @author guo.haien
 * @date 2019/2/21 14:37
 */
public class OperationAdd extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA + numberB;
    }
}
