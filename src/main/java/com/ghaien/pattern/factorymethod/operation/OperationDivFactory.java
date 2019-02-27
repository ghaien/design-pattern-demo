package com.ghaien.pattern.factorymethod.operation;

/**
 * 除法运算工厂类
 *
 * @author guo.haien
 * @date 2019/2/27 13:34
 */
public class OperationDivFactory implements OperationFactory {

    @Override
    public AbstractOperation createOperation() {
        return new OperationDiv();
    }
}
