package com.jeff.templatemethod;

import java.io.IOException;

/**
 * Created by Aaron on 2019/8/14.
 */
public class Test {
    public static void main(String[] args) throws IOException {

        AliPayment aliPayment = new AliPayment();
        aliPayment.setQuick(false);
        aliPayment.pay();
    }
}
