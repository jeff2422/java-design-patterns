package com.jeff.factory.factorymethod;

import com.jeff.factory.simplefactory.Payment;
import com.jeff.factory.simplefactory.WeChatPayment;

/**
 * 工厂方法模式，工厂实现类
 * Created by Aaron on 2019/8/14.
 */
public class WeChatPayFactory implements PaymentFactory {
    @Override
    public Payment getPayment() {
        return new WeChatPayment();
    }
}
