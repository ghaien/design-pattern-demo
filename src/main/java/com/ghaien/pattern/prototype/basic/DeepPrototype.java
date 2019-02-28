package com.ghaien.pattern.prototype.basic;

/**
 * 深表复制原型类
 *
 * @author guo.haien
 * @date 2019/2/28 11:11
 */
public class DeepPrototype extends Prototype {

    private Deep deep;

    public DeepPrototype() {
        super();
        Deep deep = new Deep();
        deep.setNumberC(4);
        this.deep = deep;
    }

    @Override
    public void changeNumber() {
        super.changeNumber();
        deep.setNumberC(6);
    }

    @Override
    public DeepPrototype clone() {
        DeepPrototype deepPrototype = (DeepPrototype) super.clone();
        deepPrototype.deep = (Deep) deep.clone();
        return deepPrototype;
    }

    @Override
    public String toString() {
        return super.toString() + ", deep=" + deep;
    }
}

class Deep implements Cloneable {

    private int NumberC;

    public int getNumberC() {
        return NumberC;
    }

    public void setNumberC(int numberC) {
        NumberC = numberC;
    }

    @Override
    protected Object clone() {
        try {
            return super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
