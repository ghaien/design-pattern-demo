package com.ghaien.pattern.decorator.basic;

/**
 * Component接口的一个具体对象
 *
 * @author guo.haien
 * @date 2019/2/25 13:49
 */
public class ConcreteComponent implements Component {

    @Override
    public void decoration() {
        System.out.println("未装饰的操作");
    }
}
