package com.jeff.observer.custom;

/**
 * 被观察者接口
 * 该模式的例子，采用的是《Head First 设计模式》一书中的例子，做了少量改动，建议有空可以阅读该书。
 *
 * Created by Jeff on 2019/8/15.
 */
public interface Subject {

    /**
     * 增加观察者
     * @param observer
     */
    public void registerObserver(Observer observer);

    /**
     * 移除观察者
     * @param observer
     */
    public void removeObserver(Observer observer);

    /**
     * 通知所有的观察者
     */
    public void notifyObservers();
}
