package com.ghaien.pattern.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 *
 * @author guo.haien
 * @date 2019/2/26 10:16
 */
public class DynamicProxy implements InvocationHandler {

    private Object source;

    public DynamicProxy(Object source) {
        this.source = source;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理的方法");
        return method.invoke(source, args);
    }
}
