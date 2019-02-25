package com.ghaien.pattern.decorator.finery;

/**
 * 衬衫
 *
 * @author guo.haien
 * @date 2019/2/25 14:38
 */
public class Shirt extends Finery {

    public Shirt(Person person) {
        super(person);
    }

    @Override
    public void show() {
        System.out.print("衬衫 ");
        person.show();

    }
}
