package com.jeff.factory.simplefactory;

/**
 * Created by Aaron on 2019/8/14.
 */
public class WeChatPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("WeChat Payment");
    }
}
