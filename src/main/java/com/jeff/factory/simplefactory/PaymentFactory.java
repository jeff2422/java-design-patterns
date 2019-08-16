package com.jeff.factory.simplefactory;

/**
 * 简单工厂模式
 * Created by Aaron on 2019/8/14.
 */
public class PaymentFactory {

    public static Payment getPayment(String payType) {
        if (payType == null) {
            return null;
        }
        if (payType.equalsIgnoreCase("ALIPAYMENT")) {
            return new AliPayment();
        } else if (payType.equalsIgnoreCase("WECHATPAYMENT")) {
            return new WeChatPayment();
        }
        return null;
    }
}
