package com.ghaien.pattern.easyfactory.operation;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/21 14:44
 */
public class Test {

    public static void main(String[] args) {
        OperationFactory of = new OperationFactory();
        AbstractOperation add = of.createOperation(OperationFactory.OPERATION_TYPE_ADD);
        add.setNumberA(3);
        add.setNumberB(4);
        System.out.println(add.getResult());

        AbstractOperation sub = of.createOperation(OperationFactory.OPERATION_TYPE_SUB);
        sub.setNumberA(3);
        sub.setNumberB(4);
        System.out.println(sub.getResult());

        AbstractOperation mul = of.createOperation(OperationFactory.OPERATION_TYPE_MUL);
        mul.setNumberA(3);
        mul.setNumberB(4);
        System.out.println(mul.getResult());

        AbstractOperation div = of.createOperation(OperationFactory.OPERATION_TYPE_DIV);
        div.setNumberA(3);
        div.setNumberB(4);
        System.out.println(div.getResult());
        div.setNumberB(0);
        System.out.println(div.getResult());
    }
}
