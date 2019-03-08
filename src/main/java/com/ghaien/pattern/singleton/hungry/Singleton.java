package com.ghaien.pattern.singleton.hungry;

/**
 * @author guo.haien
 * @date 2019/3/7 13:28
 */
public class Singleton {

    private static Singleton singleton = new Singleton();

    private Singleton() {
    }

    public static Singleton getInstance() {
        return singleton;
    }
}
