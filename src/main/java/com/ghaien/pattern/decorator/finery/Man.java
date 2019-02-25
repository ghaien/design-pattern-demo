package com.ghaien.pattern.decorator.finery;

/**
 * 待打扮的男人
 *
 * @author guo.haien
 * @date 2019/2/25 14:28
 */
public class Man implements Person {

    @Override
    public void show() {
        System.out.print("打扮的男人");
    }
}
