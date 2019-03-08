package com.ghaien.pattern.observer.basic;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体的主题
 *
 * @author guo.haien
 * @date 2019/3/5 15:33
 */
public class ConcreteSubject {

    private String subjectState;

    private List<Observer> observers = new ArrayList<>();

    /**
     * 添加
     *
     * @param observer 观察者
     */
    public void attach(Observer observer) {
        observers.add(observer);
    }

    /**
     * 移除
     *
     * @param observer 观察者
     */
    public void detach(Observer observer) {
        observers.remove(observer);
    }

    /**
     * 修改
     *
     * @param subjectState 主题状态
     */
    public void changeState(String subjectState) {
        this.subjectState = subjectState;
        inform();
    }

    /**
     * 通知
     */
    public void inform() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public String getSubjectState() {
        return subjectState;
    }
}
