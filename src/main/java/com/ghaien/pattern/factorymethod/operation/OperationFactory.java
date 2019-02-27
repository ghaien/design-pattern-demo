package com.ghaien.pattern.factorymethod.operation;

/**
 * 运算工厂接口
 *
 * @author guo.haien
 * @date 2019/2/27 13:32
 */
public interface OperationFactory {
    /**
     * 创建运算对象
     *
     * @return 运算对象
     */
    AbstractOperation createOperation();
}
