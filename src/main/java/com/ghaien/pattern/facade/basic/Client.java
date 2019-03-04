package com.ghaien.pattern.facade.basic;

/**
 * @author guo.haien
 * @date 2019/3/4 10:53
 */
public class Client {

    public static void main(String[] args) {
        Facade facade = new FacadeImpl();
        facade.methodA();
        System.out.println("-------------");
        facade.methodB();
        /*输出
        方法组A
        子系统方法1
        子系统方法3
        子系统方法4
        -------------
        方法组B
        子系统方法1
        子系统方法2
        子系统方法3
         */
    }
}
