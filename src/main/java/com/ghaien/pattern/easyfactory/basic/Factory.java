package com.ghaien.pattern.easyfactory.basic;

/**
 * 工厂类
 *
 * @author guo.haien
 * @date 2019/2/21 13:51
 */
public class Factory {

    public static final String PRODUCT_TYPE_A = "A";

    public static final String PRODUCT_TYPE_B = "B";

    /**
     * 通过产品类型来创建相应的产品对象
     *
     * @param productType 产品类型
     * @return 产品对象
     */
    public Product createProduct(String productType) {
        switch (productType) {
            case PRODUCT_TYPE_A:
                return new ProductA();
            case PRODUCT_TYPE_B:
                return new ProductB();
            default:
                throw new RuntimeException("输入的产品类型错误：" + productType);
        }
    }
}
