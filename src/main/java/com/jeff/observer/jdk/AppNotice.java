package com.jeff.observer.jdk;

import com.jeff.observer.custom.DisplayElement;

import java.util.Observable;
import java.util.Observer;


/**
 * App通知类，使用JDK实现
 * Created by Jeff on 2019/8/16.
 */
public class AppNotice implements Observer, DisplayElement{

    private Observable weatherData;
    private float temperature;
    private float humidity;
    private float pressure;

    public AppNotice(Observable weatherData) {
        this.weatherData = weatherData;
        weatherData.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            this.temperature = ((WeatherData) o).getTemperature();
            this.humidity = ((WeatherData) o).getHumidity();
            this.pressure = ((WeatherData) o).getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("手机APP通知: 温度-" + temperature + ", 湿度-" + humidity + ", 气压-" + pressure );
    }
}
