package com.ghaien.pattern.strategy.discount;

/**
 * VIP
 *
 * @author guo.haien
 * @date 2019/2/22 9:32
 */
public interface Vip {
    /**
     * 计算并返回打折后的价格
     *
     * @param price 打折前价格
     * @return 打折后价格
     */
    double discount(double price);
}
