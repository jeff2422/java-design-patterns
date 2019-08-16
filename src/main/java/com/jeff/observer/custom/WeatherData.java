package com.jeff.observer.custom;

import java.util.ArrayList;

/**
 * 天气数据类（被观察者的实现）
 * 该模式的例子，采用的是《Head First 设计模式》一书中的例子，做了少量改动，建议有空可以阅读该书。
 *
 * Created by Jeff on 2019/8/15.
 */
public class WeatherData implements Subject {

    private ArrayList<Observer> observers; // 需要通知的观察者集合
    private float temperature;
    private float humidity;
    private float pressure;

    /**
     * 构造方法，初始化了观察者集合
     */
    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        int i = observers.indexOf(observer);
        if (i >= 0) {
            observers.add(observer);
        }
    }

    @Override
    public void notifyObservers() {
        observers.forEach(observer -> observer.update(temperature, humidity, pressure));
    }

    /**
     * 业务方法，当天气变化时候，通知观察者
     */
    public void measurementsChanged() {
        notifyObservers();
    }

    /**
     * 业务方法，方便生成天气数据。
     * @param temperature
     * @param humidity
     * @param pressure
     */
    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
