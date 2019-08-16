package com.jeff.proxy;

/**
 * 被代理业务的抽象接口
 * Created by Jeff on 2019/8/15.
 */
public interface IPayment {

    /**
     * 被代理的方法
     */
    void pay();
}
