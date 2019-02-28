package com.ghaien.pattern.templatemethod.basic;

/**
 * 父类
 *
 * @author guo.haien
 * @date 2019/2/28 14:43
 */
public abstract class AbstractClass {
    /**
     * 可变方法1
     */
    public abstract void changeMethod1();

    /**
     * 可变方法2
     */
    public abstract void changeMethod2();

    public void templateMethod() {
        System.out.println("执行可变方法1前");
        changeMethod1();
        System.out.println("执行可变方法1后");
        System.out.println("执行可变方法2前");
        changeMethod2();
        System.out.println("执行可变方法2后");
    }
}
