package com.jeff.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

/**
 * Created by Aaron on 2019/8/14.
 */
public abstract class PayTemplate {

    protected abstract void scanQRCode(String qrcode);

    protected abstract boolean checkPassword(String input);

    protected void selectPayMethod(String payMethod){
        System.out.println("使用Change方式支付");
    }

    private boolean submit() {
        System.out.println("支付成功……");
        return true;
    }

    protected boolean openQuickPay() {
        return false;
    }

    public void pay() throws IOException {
        System.out.println("请输入商品二维码：");
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        scanQRCode(bufferedReader.readLine());

        System.out.println("请输入支付方式(0-Change(Default)、1-Debt Card、2-Credit Card");
        bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        selectPayMethod(bufferedReader.readLine());

        if(openQuickPay()) {
            submit();
        }else {
            System.out.println("请输入密码：");
            bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            if (checkPassword(bufferedReader.readLine())) {
                submit();
            } else {
                System.out.println("支付失败，密码错误……");
            }
        }
    }
}
