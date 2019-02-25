package com.ghaien.pattern.decorator.basic;

/**
 * 装饰抽象类
 *
 * @author guo.haien
 * @date 2019/2/25 13:52
 */
public abstract class Decorator implements Component {

    protected Component component;

    public Decorator(Component component) {
        super();
        this.component = component;
    }

    @Override
    public void decoration() {
        if (component != null) {
            component.decoration();
        }
    }
}
