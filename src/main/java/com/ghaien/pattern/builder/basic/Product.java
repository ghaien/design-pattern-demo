package com.ghaien.pattern.builder.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 产品类
 *
 * @author guo.haien
 * @date 2019/3/4 16:18
 */
public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        parts.add(part);
    }

    public void show() {
        System.out.println("开始创建：");
        for (String part : parts) {
            System.out.println(part);
        }
    }
}
