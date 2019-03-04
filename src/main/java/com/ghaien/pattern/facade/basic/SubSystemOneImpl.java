package com.ghaien.pattern.facade.basic;

/**
 * 子系统1实现
 *
 * @author guo.haien
 * @date 2019/3/4 10:49
 */
public class SubSystemOneImpl implements SubSystemOne {

    @Override
    public void methodOne() {
        System.out.println("子系统方法1");
    }
}
