package com.ghaien.pattern.decorator.basic;

/**
 * 装饰抽象类的A类实现
 *
 * @author guo.haien
 * @date 2019/2/25 13:55
 */
public class ConcreteDecoratorA extends Decorator {

    public ConcreteDecoratorA(Component component) {
        super(component);
    }

    @Override
    public void decoration() {
        System.out.println("装饰A之前");
        super.decoration();
        System.out.println("装饰A之后");
    }

    public void decorationA() {
        System.out.println("装饰A之后扩展的方法");
    }
}
