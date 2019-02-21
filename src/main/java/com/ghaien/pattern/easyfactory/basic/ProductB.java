package com.ghaien.pattern.easyfactory.basic;

/**
 * 产品B
 *
 * @author guo.haien
 * @date 2019/2/21 13:57
 */
public class ProductB implements Product {

    @Override
    public void use() {
        System.out.println("使用产品B");
    }
}
