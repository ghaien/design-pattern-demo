package com.ghaien.pattern.templatemethod.basic;

/**
 * @author guo.haien
 * @date 2019/2/28 14:51
 */
public class Test {

    public static void main(String[] args) {
        AbstractClass a = new ConcreteClassA();
        a.templateMethod();
        System.out.println("------------------");
        AbstractClass b = new ConcreteClassB();
        b.templateMethod();
    }
}
