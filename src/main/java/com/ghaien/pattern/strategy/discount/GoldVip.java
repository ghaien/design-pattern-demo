package com.ghaien.pattern.strategy.discount;

/**
 * 黄金VIP
 *
 * @author guo.haien
 * @date 2019/2/22 9:37
 */
public class GoldVip implements Vip {

    @Override
    public double discount(double price) {
        return price * 0.75;
    }
}
