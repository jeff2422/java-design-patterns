package com.jeff.templatemethod;

/**
 * Created by Aaron on 2019/8/14.
 */
public class AliPayment extends PayTemplate {

    private boolean quickPayFlag = true;

    @Override
    protected boolean openQuickPay() {
        System.out.println("使用快速支付……");
        return quickPayFlag;
    }

    public void setQuick(boolean quickPayFlag) {
        this.quickPayFlag = quickPayFlag;
    }

    @Override
    protected void scanQRCode(String qrcode) {
        System.out.println("AliPay scanning...");
    }

    @Override
    protected void selectPayMethod(String payMethod) {
        if(payMethod.equals("0")){
            System.out.println("已使用 Change 方式支付……");
        }else if(payMethod.equals("1")){
            System.out.println("已使用 Debt Card 方式支付……");
        }else if(payMethod.equals("2")){
            System.out.println("已使用 Credit Card 方式支付……");
        }else {
            System.out.println("已使用其他方式支付……");
        }
    }

    @Override
    protected boolean checkPassword(String input) {
        if (input != null && input.equals("123")) {
            return true;
        }
        return false;
    }
}
