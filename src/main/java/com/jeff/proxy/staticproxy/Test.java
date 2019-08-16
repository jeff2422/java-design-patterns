package com.jeff.proxy.staticproxy;

import com.jeff.proxy.AliPayment;
import com.jeff.proxy.WeChatPayment;

/**
 * 测试类
 *
 * Created by Jeff on 2019/8/15.
 */
public class Test {
    public static void main(String[] args) {
        AliPayment aliPayment = new AliPayment();
        PaymentProxy paymentProxy = new PaymentProxy(aliPayment);
        paymentProxy.pay();

        WeChatPayment weChatPayment = new WeChatPayment();
        paymentProxy = new PaymentProxy(weChatPayment);
        paymentProxy.pay();
    }
}
