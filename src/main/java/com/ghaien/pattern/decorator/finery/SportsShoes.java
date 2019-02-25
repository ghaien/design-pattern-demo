package com.ghaien.pattern.decorator.finery;

/**
 * 运动鞋
 *
 * @author guo.haien
 * @date 2019/2/25 14:35
 */
public class SportsShoes extends Finery {

    public SportsShoes(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("运动鞋 ");
        person.show();
    }
}
