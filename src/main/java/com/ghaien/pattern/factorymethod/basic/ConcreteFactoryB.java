package com.ghaien.pattern.factorymethod.basic;

/**
 * 具体的工厂类B
 *
 * @author guo.haien
 * @date 2019/2/27 11:01
 */
public class ConcreteFactoryB implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductB();
    }
}
