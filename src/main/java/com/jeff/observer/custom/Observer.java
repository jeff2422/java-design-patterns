package com.jeff.observer.custom;

/**
 * 观察者接口
 * 该模式的例子，采用的是《Head First 设计模式》一书中的例子，做了少量改动，建议有空可以阅读该书。
 *
 * Created by Jeff on 2019/8/15.
 */
public interface Observer {

    /**
     * 观察者需要做出的动作
     *
     * @param temperature 温度
     * @param humidity 湿度
     * @param pressure 气压
     */
    public void update(float temperature, float humidity, float pressure);
}
