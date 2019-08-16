package com.jeff.factory.abstractfactory;

/**
 * Created by Aaron on 2019/8/14.
 */
public class IOS implements OS {
    @Override
    public void run() {
        System.out.println("IOS is running...");
    }
}
