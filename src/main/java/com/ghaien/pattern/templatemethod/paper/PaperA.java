package com.ghaien.pattern.templatemethod.paper;

/**
 * 考卷A
 *
 * @author guo.haien
 * @date 2019/2/28 17:11
 */
public class PaperA extends AbstractPaper {
    @Override
    public void answer1() {
        System.out.println("A");
    }

    @Override
    public void answer2() {
        System.out.println("B");
    }

    @Override
    public void answer3() {
        System.out.println("C");
    }
}
