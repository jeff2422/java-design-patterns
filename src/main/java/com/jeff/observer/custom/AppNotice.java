package com.jeff.observer.custom;

/**
 * App通知类（观察者）
 * 该模式的例子，采用的是《Head First 设计模式》一书中的例子，做了少量改动，建议有空可以阅读该书。
 *
 * Created by Jeff on 2019/8/16.
 */
public class AppNotice implements Observer, DisplayElement{

    private Subject weatherData; // 注入被观察者，方便添加观察者（也可以不注入，但需要使用的时候手动调用）
    private float temperature;
    private float humidity;
    private float pressure;

    public AppNotice(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this); // 把自身（观察者）添加到被观察者需要通知的集合里面
    }

    @Override
    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }

    @Override
    public void display() {
        System.out.println("手机APP通知: 温度-" + temperature + ", 湿度-" + humidity + ", 气压-" + pressure );
    }
}
