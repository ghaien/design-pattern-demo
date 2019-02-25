package com.ghaien.pattern.decorator.basic;

/**
 * 装饰抽象类的B类实现
 *
 * @author guo.haien
 * @date 2019/2/25 13:58
 */
public class ConcreteDecoratorB extends Decorator {

    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void decoration() {
        System.out.println("装饰B之前");
        super.decoration();
        System.out.println("装饰B之后");
    }

    public void decorationB() {
        System.out.println("装饰B之后扩展的方法");
    }
}
