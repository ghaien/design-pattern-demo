package com.ghaien.pattern.prototype.basic;

/**
 * 深表复制测试
 *
 * @author guo.haien
 * @date 2019/2/28 11:16
 */
public class DeepTest {

    public static void main(String[] args) {
        DeepPrototype prototype = new DeepPrototype();
        prototype.changeNumber();
        System.out.println(prototype);

        DeepPrototype copyPrototype = prototype.clone();
        System.out.println(copyPrototype);
    }
}
