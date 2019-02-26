package com.ghaien.pattern.proxy.staticstate;

/**
 * 真正的项目即需要被代理
 *
 * @author guo.haien
 * @date 2019/2/26 10:00
 */
public class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("真实的请求");
    }
}
