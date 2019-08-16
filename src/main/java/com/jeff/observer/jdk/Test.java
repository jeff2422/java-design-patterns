package com.jeff.observer.jdk;


/**
 * 测试类
 *
 * Created by Jeff on 2019/8/16.
 */
public class Test {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new SmsNotice(weatherData);
        new AppNotice(weatherData);
        weatherData.setMeasurements(25, 20, 80);
        weatherData.setMeasurements(30, 30, 90);
    }
}
