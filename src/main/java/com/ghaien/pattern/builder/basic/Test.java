package com.ghaien.pattern.builder.basic;

/**
 * @author guo.haien
 * @date 2019/3/4 16:34
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Builder builderA = new ConcreteBuilderA();
        director.construct(builderA);
        Product productA = builderA.getResult();
        productA.show();
        System.out.println("-------");
        Builder builderB = new ConcreteBuilderB();
        director.construct(builderB);
        Product productB = builderB.getResult();
        productB.show();
        /*输出
        开始创建：
        部件A1
        部件A2
        -------
        开始创建：
        部件B1
        部件B2
         */
    }
}
