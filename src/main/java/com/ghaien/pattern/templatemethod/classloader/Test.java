package com.ghaien.pattern.templatemethod.classloader;

/**
 * @author guo.haien
 * @date 2019/2/28 15:54
 */
public class Test {

    public static void main(String[] args) throws Exception {
        MyClassLoader classLoader = new MyClassLoader();
        Class<?> cla = classLoader.loadClass("com.ghaien.pattern.templatemethod.classloader.ClassLoaderTest");
        Object entity = cla.newInstance();
        System.out.println(entity instanceof ClassLoaderTest);
        System.out.println(entity);
    }
}
