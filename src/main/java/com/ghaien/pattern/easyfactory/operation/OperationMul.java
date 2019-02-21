package com.ghaien.pattern.easyfactory.operation;

/**
 * 乘法运算
 *
 * @author guo.haien
 * @date 2019/2/21 14:42
 */
public class OperationMul extends AbstractOperation {

    @Override
    public double getResult() {
        return numberA * numberB;
    }
}
