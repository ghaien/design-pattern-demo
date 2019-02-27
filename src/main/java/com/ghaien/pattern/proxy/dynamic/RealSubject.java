package com.ghaien.pattern.proxy.dynamic;

/**
 * 真正的项目即需要被代理
 *
 * @author guo.haien
 * @date 2019/2/26 10:00
 */
public class RealSubject implements Subject {

    @Override
    public void request1() {
        System.out.println("真实的请求1");
    }

    @Override
    public void request2() {
        System.out.println("真实的请求2");
    }
}
