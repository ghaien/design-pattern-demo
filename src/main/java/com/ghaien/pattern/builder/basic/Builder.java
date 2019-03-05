package com.ghaien.pattern.builder.basic;

/**
 * 建造者接口
 *
 * @author guo.haien
 * @date 2019/3/4 16:23
 */
public interface Builder {
    /**
     * 建造部件1
     */
    void buildPart1();

    /**
     * 建造部件2
     */
    void buildPart2();

    /**
     * 获取构建好的产品对象
     *
     * @return 产品对象
     */
    Product getResult();
}
