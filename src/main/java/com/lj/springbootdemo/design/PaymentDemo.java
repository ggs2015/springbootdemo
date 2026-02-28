package com.lj.springbootdemo.design;
public class PaymentDemo {
    
    public static void main(String[] args) {
        System.out.println("=== 支付系统演示 ===\n");
        
        PaymentStrategy payment1 = PaymentFactory.createPayment("creditcard", "1234567890123456");
        System.out.println("支付方式: " + payment1.getType());
        payment1.pay(1000.0);
        
        System.out.println("\n---\n");
        
        PaymentStrategy payment2 = PaymentFactory.createPayment("alipay", "user001@alipay.com");
        System.out.println("支付方式: " + payment2.getType());
        payment2.pay(500.0);
        
        System.out.println("\n---\n");
        
        PaymentStrategy payment3 = PaymentFactory.createPayment("wechat", "wx_open_id_12345");
        System.out.println("支付方式: " + payment3.getType());
        payment3.pay(200.0);
    }
}
