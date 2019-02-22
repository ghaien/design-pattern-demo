package com.ghaien.pattern.strategy.discount;

/**
 * 不是VIP
 *
 * @author guo.haien
 * @date 2019/2/22 9:33
 */
public class NoVip implements Vip {

    @Override
    public double discount(double price) {
        return price;
    }
}
