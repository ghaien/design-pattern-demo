package com.ghaien.pattern.templatemethod.basic;

/**
 * 子类B
 *
 * @author guo.haien
 * @date 2019/2/28 14:48
 */
public class ConcreteClassB extends AbstractClass {
    @Override
    public void changeMethod1() {
        System.out.println("子类B的可变方法1");
    }

    @Override
    public void changeMethod2() {
        System.out.println("子类B的可变方法2");
    }
}
