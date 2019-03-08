package com.ghaien.pattern.observer.basic;

/**
 * 观察者B
 *
 * @author guo.haien
 * @date 2019/3/5 15:32
 */
public class ConcreteObserverB implements Observer {

    private String name;

    private String observerState;

    private ConcreteSubject subject;

    public ConcreteObserverB(String name, ConcreteSubject subject) {
        this.name = name;
        this.subject = subject;
    }

    @Override
    public void update() {
        observerState = "observerStateB";
        System.out.println("观察者B" + name + "发现被观察者状态变为" + subject.getSubjectState() + "，并将自身状态更新为" + observerState);
    }
}
