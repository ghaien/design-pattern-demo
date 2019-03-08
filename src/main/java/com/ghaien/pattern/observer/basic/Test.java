package com.ghaien.pattern.observer.basic;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 测试
 *
 * @author guo.haien
 * @date 2019/3/5 15:47
 */
public class Test {

    public static void main(String[] args) {
        ConcreteSubject subject = new ConcreteSubject();
        subject.attach(new ConcreteObserverA("张三", subject));
        subject.attach(new ConcreteObserverA("李四", subject));
        subject.attach(new ConcreteObserverB("王五", subject));
        subject.changeState("subjectState");
        /*输出
        观察者A张三发现被观察者状态变为subjectState，并将自身状态更新为observerStateA
        观察者A李四发现被观察者状态变为subjectState，并将自身状态更新为observerStateA
        观察者B王五发现被观察者状态变为subjectState，并将自身状态更新为observerStateB
         */
    }
}
