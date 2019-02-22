package com.ghaien.pattern.strategy.discount;

/**
 * 顾客
 *
 * @author guo.haien
 * @date 2019/2/22 9:38
 */
public class Customer {

    private double totalAmount = 0D;

    private Vip vip = new NoVip();

    /**
     * 通过顾客消费的总额计算本次消费需要支付的金额
     *
     * @param amount 本次消费总金额
     * @return 本次消费实付金额
     */
    public double pay(double amount) {
        totalAmount += amount;
        if (totalAmount > 3000D) {
            vip = new GoldVip();
        } else if (totalAmount > 2000D) {
            vip = new SuperVip();
        } else if (totalAmount > 1000D) {
            vip = new CommonVip();
        }
        return vip.discount(amount);
    }
}
