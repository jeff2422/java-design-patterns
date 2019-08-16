package com.jeff.proxy.staticproxy;

import com.jeff.proxy.IPayment;

/**
 * 静态代理类，实现被代理的业务的接口
 *
 * Created by Jeff on 2019/8/15.
 */
public class PaymentProxy implements IPayment {

    private IPayment payment; // 注入被代理业务接口

    public PaymentProxy(IPayment payment) {
        this.payment = payment;
    }

    /**
     * 被代理业务执行之前需要执行的操作
     *
     * @return
     */
    public boolean validate() {
        System.out.println("支付之前进行一些校验……");
        return true; // 默认返回true
    }

    /**
     * 被代理业务执行之后需要执行的操作
     * @return
     */
    public boolean setLogger() {
        System.out.println("支付完成，记录日志……");
        return true; // 默认返回true
    }

    @Override
    public void pay() {
        if (validate()) {
            payment.pay();
            setLogger();
        }
    }
}
