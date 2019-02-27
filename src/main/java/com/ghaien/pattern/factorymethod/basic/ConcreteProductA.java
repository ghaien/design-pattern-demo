package com.ghaien.pattern.factorymethod.basic;

/**
 * 具体的产品类A
 *
 * @author guo.haien
 * @date 2019/2/27 10:59
 */
public class ConcreteProductA implements Product {

    @Override
    public void use() {
        System.out.println("使用产品A");
    }
}
