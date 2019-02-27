package com.ghaien.pattern.factorymethod.basic;

/**
 * 具体的产品类B
 *
 * @author guo.haien
 * @date 2019/2/27 11:00
 */
public class ConcreteProductB implements Product {

    @Override
    public void use() {
        System.out.println("使用产品B");
    }
}
