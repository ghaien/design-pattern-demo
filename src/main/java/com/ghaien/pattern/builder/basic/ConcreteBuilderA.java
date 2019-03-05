package com.ghaien.pattern.builder.basic;

/**
 * 具体的构建者A
 *
 * @author guo.haien
 * @date 2019/3/4 16:25
 */
public class ConcreteBuilderA implements Builder {

    private Product product = new Product();

    @Override
    public void buildPart1() {
        product.add("部件A1");
    }

    @Override
    public void buildPart2() {
        product.add("部件A2");
    }

    @Override
    public Product getResult() {
        return product;
    }
}
