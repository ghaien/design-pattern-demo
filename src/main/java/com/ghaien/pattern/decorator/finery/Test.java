package com.ghaien.pattern.decorator.finery;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/2/25 14:38
 */
public class Test {

    public static void main(String[] args) {
        Person man = new Man();

        man = new Suit(man);
        man = new LeatherShoes(man);
        man.show();
        System.out.println();
        man = new Man();
        man = new Shirt(man);
        man = new Jeans(man);
        man = new SportsShoes(man);
        man.show();
        /* 输出
        皮鞋 西装 打扮的男人
        运动鞋 牛仔裤 衬衫 打扮的男人
         */
    }
}
