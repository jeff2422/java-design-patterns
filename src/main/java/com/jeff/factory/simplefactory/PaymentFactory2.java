package com.jeff.factory.simplefactory;

/**
 * 简单工厂模式（使用反射实现）
 * Created by Aaron on 2019/8/14.
 */
public class PaymentFactory2 {

   public static Payment getClass(Class<? extends Payment> clazz) {

       Payment payment = null;

       try {
           payment = (Payment)Class.forName(clazz.getName()).newInstance();
       } catch (InstantiationException e) {
           e.printStackTrace();
       } catch (IllegalAccessException e) {
           e.printStackTrace();
       } catch (ClassNotFoundException e) {
           e.printStackTrace();
       }
       return payment;
   }
}
