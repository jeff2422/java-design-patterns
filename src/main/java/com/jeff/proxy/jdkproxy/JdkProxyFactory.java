package com.jeff.proxy.jdkproxy;

import java.lang.reflect.Proxy;

/**
 * JDK动态代理实现类
 *
 * Created by Jeff on 2019/8/15.
 */
public class JdkProxyFactory {

    private Object target; // 代理目标对象

    public JdkProxyFactory(Object target) {
        this.target = target;
    }

    /**
     * 代理方法
     * @return
     */
    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {

            System.out.println("支付之前进行一些校验……");
            Object invoke = method.invoke(target, args);
            System.out.println("支付完成，记录日志……");
            return invoke;
        });
    }
}
