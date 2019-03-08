package com.ghaien.pattern.singleton.simple;

import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.*;

/**
 * @author guo.haien
 * @date 2019/3/6 16:45
 */
public class Test {

    public static void main(String[] args) throws InterruptedException {
        Set<Singleton> singletons = Collections.synchronizedSet(new HashSet<>());
        ExecutorService es = Executors.newCachedThreadPool();
        CyclicBarrier barrier = new CyclicBarrier(1000);
        for (int i = 0; i < 1000; i++) {
            es.execute(() -> {
                try {
                    barrier.await();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                singletons.add(Singleton.getInstance());
            });
        }
        Thread.sleep(5000);
        for (Singleton singleton : singletons) {
            System.out.println(singleton);
        }
        /*其中一种输出
        com.ghaien.pattern.singleton.simple.Singleton@17631ef
        com.ghaien.pattern.singleton.simple.Singleton@78fba835
        com.ghaien.pattern.singleton.simple.Singleton@7ea1712e
         */
    }
}
