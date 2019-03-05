package com.ghaien.pattern.builder.basic;

/**
 * 建造指挥者类
 *
 * @author guo.haien
 * @date 2019/3/4 16:32
 */
public class Director {
    /**
     * 产品构建步骤
     *
     * @param builder 构建者
     */
    public void construct(Builder builder) {
        builder.buildPart1();
        builder.buildPart2();
    }
}
