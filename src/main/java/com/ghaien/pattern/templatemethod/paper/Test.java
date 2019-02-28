package com.ghaien.pattern.templatemethod.paper;

/**
 * @author guo.haien
 * @date 2019/2/28 17:12
 */
public class Test {

    public static void main(String[] args) {
        AbstractPaper paperA = new PaperA();
        paperA.createPaper();
        System.out.println("------------");
        AbstractPaper paperB = new PaperB();
        paperB.createPaper();
    }
}
