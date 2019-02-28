package com.ghaien.pattern.prototype.basic;

/**
 * 浅表复制测试类
 *
 * @author guo.haien
 * @date 2019/2/28 11:05
 */
public class ShallowTest {

    public static void main(String[] args) {
        ShallowPrototype prototype = new ShallowPrototype();
        prototype.changeNumber();
        System.out.println(prototype);

        ShallowPrototype copyPrototype = (ShallowPrototype) prototype.clone();
        System.out.println(copyPrototype);
    }
}
