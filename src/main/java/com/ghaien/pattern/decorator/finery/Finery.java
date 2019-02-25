package com.ghaien.pattern.decorator.finery;

/**
 * 服饰抽象类
 *
 * @author guo.haien
 * @date 2019/2/25 14:31
 */
public abstract class Finery implements Person {

    protected Person person;

    public Finery(Person person) {
        super();
        this.person = person;
    }

    @Override
    public void show() {
        if (person != null) {
            person.show();
        }
    }
}
