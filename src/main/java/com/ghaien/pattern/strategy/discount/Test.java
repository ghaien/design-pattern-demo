package com.ghaien.pattern.strategy.discount;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/22 9:48
 */
public class Test {

    public static void main(String[] args) {
        Customer customer = new Customer();
        System.out.println("顾客需要付钱：" + customer.pay(500D));
        System.out.println("顾客需要付钱：" + customer.pay(1200D));
        System.out.println("顾客需要付钱：" + customer.pay(1200D));
        System.out.println("顾客需要付钱：" + customer.pay(1200D));
    }
}
