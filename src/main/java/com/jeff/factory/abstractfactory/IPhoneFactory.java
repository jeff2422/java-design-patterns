package com.jeff.factory.abstractfactory;

/**
 * 抽象工厂模式，工厂实现类
 * Created by Aaron on 2019/8/14.
 */
public class IPhoneFactory implements PhoneFactory {
    @Override
    public Phone getPhone() {
        return new IPhone();
    }

    @Override
    public OS loadOS() {
        return new IOS();
    }
}
