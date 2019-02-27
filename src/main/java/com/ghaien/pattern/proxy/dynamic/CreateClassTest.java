package com.ghaien.pattern.proxy.dynamic;

import sun.misc.ProxyGenerator;

import java.io.File;
import java.io.FileOutputStream;

/**
 * 测试代码生成
 *
 * @author guo.haien
 * @date 2019/2/26 17:29
 */
public class CreateClassTest {

    public static void main(String[] args) throws Exception {
        byte[] classFile = ProxyGenerator.generateProxyClass("SubjectProxy", new Class[]{Subject.class});
        File file = new File("D:/SubjectProxy.class");
        FileOutputStream fos = new FileOutputStream(file);
        fos.write(classFile);
        fos.flush();
        fos.close();
    }
}
