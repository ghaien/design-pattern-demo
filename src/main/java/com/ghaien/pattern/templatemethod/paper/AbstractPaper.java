package com.ghaien.pattern.templatemethod.paper;

/**
 * 考卷抽象类
 *
 * @author guo.haien
 * @date 2019/2/28 17:07
 */
public abstract class AbstractPaper {
    /**
     * 抄写一张考卷
     */
    public void createPaper() {
        question1();
        answerText();
        answer1();
        question2();
        answerText();
        answer2();
        question3();
        answerText();
        answer3();
    }

    private void question1() {
        System.out.println("问题1：");
    }

    private void question2() {
        System.out.println("问题2：");
    }

    private void question3() {
        System.out.println("问题3：");
    }

    private void answerText() {
        System.out.print("答案：");
    }

    /**
     * 问题1的答案
     */
    public abstract void answer1();
    /**
     * 问题2的答案
     */
    public abstract void answer2();
    /**
     * 问题3的答案
     */
    public abstract void answer3();
}
