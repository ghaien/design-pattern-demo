package com.ghaien.pattern.templatemethod.paper;

/**
 * @author guo.haien
 * @date 2019/2/28 17:07
 */
public abstract class AbstractPaper {

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

    public void question1() {
        System.out.println("问题1：");
    }

    public void question2() {
        System.out.println("问题2：");
    }

    public void question3() {
        System.out.println("问题3：");
    }

    public void answerText() {
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
