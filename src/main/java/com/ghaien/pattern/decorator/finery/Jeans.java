package com.ghaien.pattern.decorator.finery;

/**
 * 牛仔裤
 *
 * @author guo.haien
 * @date 2019/2/25 14:33
 */
public class Jeans extends Finery {

    public Jeans(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("牛仔裤 ");
        person.show();
    }
}
