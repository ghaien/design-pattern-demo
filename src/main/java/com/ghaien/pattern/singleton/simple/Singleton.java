package com.ghaien.pattern.singleton.simple;

/**
 * 最基础的单例类
 *
 * @author guo.haien
 * @date 2019/3/6 16:30
 */
public class Singleton {

    private static Singleton singleton;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }
}
