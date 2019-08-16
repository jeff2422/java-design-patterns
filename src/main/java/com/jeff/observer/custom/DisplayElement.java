package com.jeff.observer.custom;

/**
 * 业务抽象接口，观察者接收到通知，需要处理的业务
 * 该模式的例子，采用的是《Head First 设计模式》一书中的例子，做了少量改动，建议有空可以阅读该书。
 *
 * Created by Jeff on 2019/8/15.
 */
public interface DisplayElement {

    /**
     * 显示方法，交给子类方法去实现
     */
    public void display();
}
