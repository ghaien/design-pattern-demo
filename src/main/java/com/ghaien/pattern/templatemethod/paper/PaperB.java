package com.ghaien.pattern.templatemethod.paper;

/**
 * @author guo.haien
 * @date 2019/2/28 17:11
 */
public class PaperB extends AbstractPaper {
    @Override
    public void answer1() {
        System.out.println("C");
    }

    @Override
    public void answer2() {
        System.out.println("B");
    }

    @Override
    public void answer3() {
        System.out.println("A");
    }
}
