package com.ghaien.pattern.easyfactory.operation;

import java.util.Scanner;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/21 14:44
 */
public class Test {

    public static void main(String[] args) {
        OperationFactory of = new OperationFactory();
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入数字A：");
        double numberA = scanner.nextDouble();
        System.out.println("请输入运算符号：");
        String operationType = scanner.next();
        System.out.println("请输入数字B：");
        double numberB = scanner.nextDouble();
        AbstractOperation operation = of.createOperation(operationType);
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(numberA + operationType + numberB + "=" + operation.getResult());
    }
}
