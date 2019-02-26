package com.ghaien.pattern.proxy.staticstate;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/26 10:04
 */
public class Test {

    public static void main(String[] args) {
        Proxy proxy = new Proxy();
        proxy.request();
        /* 输出
        真实的请求
         */
    }
}
