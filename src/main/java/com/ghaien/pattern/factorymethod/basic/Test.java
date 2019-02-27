package com.ghaien.pattern.factorymethod.basic;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/27 11:06
 */
public class Test {

    public static void main(String[] args) {
        Factory factoryA = new ConcreteFactoryA();
        Product productA = factoryA.createProduct();
        productA.use();

        Factory factoryB = new ConcreteFactoryB();
        Product productB = factoryB.createProduct();
        productB.use();
        /*输出
        使用产品A
        使用产品B
         */
    }
}
