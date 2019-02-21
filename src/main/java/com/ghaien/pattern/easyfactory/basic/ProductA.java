package com.ghaien.pattern.easyfactory.basic;

/**
 * 产品A
 *
 * @author guo.haien
 * @date 2019/2/21 13:57
 */
public class ProductA implements Product {

    @Override
    public void use() {
        System.out.println("使用产品A");
    }
}
