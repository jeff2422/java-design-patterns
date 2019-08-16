package com.jeff.proxy.jdkproxy;

import com.jeff.proxy.AliPayment;
import com.jeff.proxy.IPayment;

/**
 * Created by Jeff on 2019/8/15.
 */
public class Test {
    public static void main(String[] args) {
        IPayment payment = new AliPayment();
        JdkProxyFactory jdkProxyFactory = new JdkProxyFactory(payment);
        IPayment proxyInstance = (IPayment)jdkProxyFactory.getProxyInstance();
        proxyInstance.pay();
    }
}
