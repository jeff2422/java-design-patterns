package com.jeff.factory.abstractfactory;

/**
 * Created by Aaron on 2019/8/14.
 */
public class Pixel implements Phone {
    @Override
    public void call() {
        System.out.println("Pixel is calling...");
    }
}
