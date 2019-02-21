package com.ghaien.pattern.easyfactory.operation;

/**
 * 除法运算
 *
 * @author guo.haien
 * @date 2019/2/21 14:43
 */
public class OperationDiv extends AbstractOperation {

    @Override
    public double getResult() {
        if (numberB == 0D) {
            throw new RuntimeException("除数不能为0");
        }
        return numberA / numberB;
    }
}
