package com.ghaien.pattern.prototype.basic;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/28 11:01
 */
public class Test {

    public static void main(String[] args) {
        Prototype prototype = new Prototype();
        prototype.changeNumber();
        System.out.println(prototype);

        Prototype copyPrototype = prototype.clone();
        System.out.println(copyPrototype);
    }
}
