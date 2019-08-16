package com.jeff.factory.factorymethod;

import com.jeff.factory.simplefactory.Payment;

/**
 * 工厂方法模式，工厂接口
 * Created by Aaron on 2019/8/14.
 */
public interface PaymentFactory {

   Payment getPayment();
}
