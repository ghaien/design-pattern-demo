package com.ghaien.pattern.decorator.finery;

/**
 * 西装
 *
 * @author guo.haien
 * @date 2019/2/25 14:34
 */
public class Suit extends Finery {
    public Suit(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("西装 ");
        person.show();
    }
}
