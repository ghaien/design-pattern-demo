package com.ghaien.pattern.decorator.basic;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/25 14:03
 */
public class Test {

    public static void main(String[] args) {
        Component component = new ConcreteComponent();
        component.decoration();
        System.out.println("----------------");
        component = new ConcreteDecoratorA(component);
        component.decoration();
        ((ConcreteDecoratorA) component).decorationA();
        System.out.println("----------------");
        component = new ConcreteDecoratorB(component);
        component.decoration();
        ((ConcreteDecoratorB) component).decorationB();
        /* 输出
        未装饰的操作
        ----------------
        装饰A之前
        未装饰的操作
        装饰A之后
        装饰A之后扩展的方法
        ----------------
        装饰B之前
        装饰A之前
        未装饰的操作
        装饰A之后
        装饰B之后
        装饰B之后扩展的方法
         */
    }
}
