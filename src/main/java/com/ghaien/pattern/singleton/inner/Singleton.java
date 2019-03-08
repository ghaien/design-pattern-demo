package com.ghaien.pattern.singleton.inner;

/**
 * @author guo.haien
 * @date 2019/3/7 13:18
 */
public class Singleton {

    private Singleton() {
    }

    public static Singleton getInstance() {
        return InnerSingleton.singleton;
    }

    private static class InnerSingleton {
        static Singleton singleton = new Singleton();
    }
}
