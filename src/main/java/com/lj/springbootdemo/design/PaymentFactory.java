package com.lj.springbootdemo.design;
public class PaymentFactory {
    
    public static PaymentStrategy createPayment(String type, String accountInfo) {
        switch (type.toLowerCase()) {
            case "creditcard":
                return new CreditCardPayment(accountInfo);
            case "alipay":
                return new AlipayPayment(accountInfo);
            case "wechat":
                return new WeChatPayment(accountInfo);
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + type);
        }
    }
}
