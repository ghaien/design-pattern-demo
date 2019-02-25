package com.ghaien.pattern.decorator.finery;

/**
 * 皮鞋
 *
 * @author guo.haien
 * @date 2019/2/25 14:36
 */
public class LeatherShoes extends Finery {

    public LeatherShoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("皮鞋 ");
        person.show();
    }
}
