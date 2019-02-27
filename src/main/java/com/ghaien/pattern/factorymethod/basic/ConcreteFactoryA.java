package com.ghaien.pattern.factorymethod.basic;

/**
 * 具体的工厂类A
 *
 * @author guo.haien
 * @date 2019/2/27 10:58
 */
public class ConcreteFactoryA implements Factory {

    @Override
    public Product createProduct() {
        return new ConcreteProductA();
    }
}
