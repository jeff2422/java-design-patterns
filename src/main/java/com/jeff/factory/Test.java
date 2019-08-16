package com.jeff.factory;

import com.jeff.factory.abstractfactory.IPhoneFactory;
import com.jeff.factory.abstractfactory.OS;
import com.jeff.factory.abstractfactory.Phone;
import com.jeff.factory.abstractfactory.PixelFactory;
import com.jeff.factory.simplefactory.AliPayment;
import com.jeff.factory.simplefactory.Payment;
import com.jeff.factory.factorymethod.AliPayFactory;
import com.jeff.factory.simplefactory.PaymentFactory;
import com.jeff.factory.simplefactory.PaymentFactory2;
import com.jeff.factory.simplefactory.WeChatPayment;

/**
 * 测试类
 * Created by Aaron on 2019/8/14.
 */
public class Test {
    public static void main(String[] args) {

        // 简单工厂模式
        Payment aliPayment = PaymentFactory.getPayment("ALIPAYMENT");
        aliPayment.pay();
        Payment weChatPayment = PaymentFactory.getPayment("WECHATPAYMENT");
        weChatPayment.pay();
        Payment aliPayment2 = PaymentFactory2.getClass(AliPayment.class);
        aliPayment2.pay();
        Payment weChatPayment2 = PaymentFactory2.getClass(WeChatPayment.class);
        weChatPayment2.pay();

        // 工厂方法模式
        AliPayFactory aliPayFactory = new AliPayFactory();
        Payment aliPayFactoryPayment = aliPayFactory.getPayment();
        aliPayFactoryPayment.pay();

        // 抽象工厂模式
        PixelFactory pixelFactory = new PixelFactory();
        OS android = pixelFactory.loadOS();
        Phone pixel = pixelFactory.getPhone();
        android.run();
        pixel.call();

        IPhoneFactory iPhoneFactory = new IPhoneFactory();
        OS ios = iPhoneFactory.loadOS();
        Phone iphone = iPhoneFactory.getPhone();
        ios.run();
        iphone.call();
    }
}
