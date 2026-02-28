package com.lj.springbootdemo.design;
public class WeChatPayment extends AbstractPaymentTemplate {
    
    private final String openId;
    
    public WeChatPayment(String openId) {
        this.openId = openId;
    }
    
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.006;
    }
    
    @Override
    protected void executePayment(double total) {
        System.out.println("Processing WeChat Pay payment of " + total + " from user " + openId);
    }
    
    @Override
    public void pay(double amount) {
        processPayment(amount);
    }
    
    @Override
    public String getType() {
        return "WeChat Pay";
    }
}
