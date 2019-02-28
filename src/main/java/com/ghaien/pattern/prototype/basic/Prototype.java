package com.ghaien.pattern.prototype.basic;

/**
 * 原型类
 *
 * @author guo.haien
 * @date 2019/2/28 10:33
 */
public class Prototype implements Cloneable {

    protected int numberA;

    protected int numberB;

    public Prototype() {
        this.numberA = 2;
        this.numberB = 3;
    }

    public void changeNumber() {
        this.numberA = 4;
        this.numberB = 5;
    }

    /**
     * 拷贝一个Prototype类型的对象
     *
     * @return 新对象
     */
    @Override
    public Prototype clone() {
        try {
            return (Prototype) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "numberA=" + numberA +
                ", numberB=" + numberB;
    }
}
