package com.ghaien.pattern.proxy.dynamic;

import sun.misc.ProxyGenerator;
import sun.reflect.misc.ReflectUtil;

import java.lang.reflect.*;
import java.util.IdentityHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.BiFunction;
import java.util.function.Supplier;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/26 10:26
 */
public class Test {

    public static void main(String[] args) {
        Subject subject = (Subject) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Subject.class},
                new DynamicProxy(new RealSubject()));
        subject.request1();
        subject.request2();
    }
}
