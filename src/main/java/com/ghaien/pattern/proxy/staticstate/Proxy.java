package com.ghaien.pattern.proxy.staticstate;

/**
 * 代理类
 *
 * @author guo.haien
 * @date 2019/2/26 10:02
 */
public class Proxy implements Subject {

    private RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
