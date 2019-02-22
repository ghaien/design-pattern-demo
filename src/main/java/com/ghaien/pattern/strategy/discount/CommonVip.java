package com.ghaien.pattern.strategy.discount;

/**
 * 普通VIP
 *
 * @author guo.haien
 * @date 2019/2/22 9:36
 */
public class CommonVip implements Vip {

    @Override
    public double discount(double price) {
        return price * 0.9;
    }
}
