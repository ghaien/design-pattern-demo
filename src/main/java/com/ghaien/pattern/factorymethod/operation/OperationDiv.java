package com.ghaien.pattern.factorymethod.operation;

/**
 * 除法运算类
 *
 * @author guo.haien
 * @date 2019/2/27 13:29
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
