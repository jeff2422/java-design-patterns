package com.jeff.proxy;

/**
 * Created by Jeff on 2019/8/15.
 */
public class WeChatPayment implements IPayment{
    @Override
    public void pay() {
        System.out.println("WeChat payment...");
    }
}
