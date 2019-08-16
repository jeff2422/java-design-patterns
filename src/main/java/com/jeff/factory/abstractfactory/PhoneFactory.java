package com.jeff.factory.abstractfactory;

/**
 * 抽象工厂模式，工厂接口
 * Created by Aaron on 2019/8/14.
 */
public interface PhoneFactory {

    public Phone getPhone();

    public OS loadOS();
}
