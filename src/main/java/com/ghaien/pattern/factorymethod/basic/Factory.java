package com.ghaien.pattern.factorymethod.basic;

/**
 * 工厂接口
 *
 * @author guo.haien
 * @date 2019/2/27 10:55
 */
public interface Factory {
    /**
     * 创建产品对象
     *
     * @return 产品对象
     */
    Product createProduct();
}
