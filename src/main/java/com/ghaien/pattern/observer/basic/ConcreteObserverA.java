package com.ghaien.pattern.observer.basic;

/**
 * 观察者A
 *
 * @author guo.haien
 * @date 2019/3/5 15:32
 */
public class ConcreteObserverA implements Observer {

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserverA(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = "observerStateA";
        System.out.println("观察者A" + name + "发现被观察者状态变为" + subject.getSubjectState() + "，并将自身状态更新为" + observerState);
    }
}
