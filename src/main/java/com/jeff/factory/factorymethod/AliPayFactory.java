package com.jeff.factory.factorymethod;

import com.jeff.factory.simplefactory.AliPayment;
import com.jeff.factory.simplefactory.Payment;

/**
 * 工厂方法模式，工厂实现类
 * Created by Aaron on 2019/8/14.
 */
public class AliPayFactory implements PaymentFactory {
    @Override
    public Payment getPayment() {
        return new AliPayment();
    }
}
