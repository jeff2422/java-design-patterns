package com.jeff.factory.simplefactory;

/**
 * Created by Aaron on 2019/8/14.
 */
public class AliPayment implements Payment {
    @Override
    public void pay() {
        System.out.println("Ali Payment");
    }
}
