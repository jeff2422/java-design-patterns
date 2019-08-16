package com.jeff.observer.jdk;

import com.jeff.observer.custom.Observer;
import com.jeff.observer.custom.Subject;

import java.util.ArrayList;
import java.util.Observable;

/**
 * 天气数据（被观察者），使用JDK实现。
 *
 * Created by Jeff on 2019/8/15.
 */
public class WeatherData extends Observable {

    private float temperature;
    private float humidity;
    private float pressure;

    public void measurementsChanged() {
        setChanged();
        notifyObservers();
    }

    public void setMeasurements(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }
}
