package com.ghaien.pattern.factorymethod.operation;

import java.util.Scanner;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/27 13:35
 */
public class Test {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numberA = scanner.nextDouble();
        System.out.println("请输入运算符号：");
        String operationType = scanner.next();
        System.out.println("请输入数字A：");
        double numberB = scanner.nextDouble();
        OperationFactory of;
        switch (operationType) {
            case "+":
                of = new OperationAddFactory();
                break;
            case "-":
                of = new OperationSubFactory();
                break;
            case "*":
                of = new OperationSubFactory();
                break;
            case "/":
                of = new OperationDivFactory();
                break;
            default:
                throw new RuntimeException("输入的运算符号错误：" + operationType);
        }
        AbstractOperation operation = of.createOperation();
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(operation.getResult());
        /*输出(值和符号随着输入的值改变而改变)
        请输入数字A：
        10
        请输入运算符号：
        +
        请输入数字A：
        20
        30.0
         */
    }
}
