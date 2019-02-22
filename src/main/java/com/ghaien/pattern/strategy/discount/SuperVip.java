package com.ghaien.pattern.strategy.discount;

/**
 * 超级VIP
 *
 * @author guo.haien
 * @date 2019/2/22 9:37
 */
public class SuperVip implements Vip {

    @Override
    public double discount(double price) {
        return price * 0.8;
    }
}
