package com.ghaien.pattern.prototype.basic;

/**
 * 浅表复制原型类
 *
 * @author guo.haien
 * @date 2019/2/28 10:39
 */
public class ShallowPrototype extends Prototype {

    private Shallow shallow;

    public Shallow getShallow() {
        return shallow;
    }

    public void setShallow(Shallow shallow) {
        this.shallow = shallow;
    }

    public ShallowPrototype() {
        super();
        Shallow shallow = new Shallow();
        shallow.setNumberC(4);
        this.shallow = shallow;
    }

    @Override
    public void changeNumber() {
        super.changeNumber();
        shallow.setNumberC(6);
    }

    @Override
    public String toString() {
        return super.toString() + ", shallow=" + shallow;
    }
}

class Shallow {

    private int numberC;

    public int getNumberC() {
        return numberC;
    }

    public void setNumberC(int numberC) {
        this.numberC = numberC;
    }
}
