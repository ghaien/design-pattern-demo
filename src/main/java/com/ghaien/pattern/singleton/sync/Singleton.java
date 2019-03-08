package com.ghaien.pattern.singleton.sync;

/**
 * @author guo.haien
 * @date 2019/3/6 17:36
 */
public class Singleton {

    private static Singleton singleton;

    public String state;

    private Singleton() {
        state = "success";
    }

    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void deleteSingleton() {
        singleton = null;
    }
}
