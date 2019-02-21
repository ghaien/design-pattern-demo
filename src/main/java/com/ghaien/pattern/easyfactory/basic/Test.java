package com.ghaien.pattern.easyfactory.basic;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/21 14:01
 */
public class Test {

    public static void main(String[] args) {
        Factory factory = new Factory();
        Product a = factory.createProduct(Factory.PRODUCT_TYPE_A);
        Product b = factory.createProduct(Factory.PRODUCT_TYPE_B);

        a.use();
        b.use();

        Product error = factory.createProduct("error");
        error.use();
    }
}
