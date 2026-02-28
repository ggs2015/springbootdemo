package com.lj.springbootdemo.design;
public class AlipayPayment extends AbstractPaymentTemplate {
    
    private final String accountId;
    
    public AlipayPayment(String accountId) {
        this.accountId = accountId;
    }
    
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.006;
    }
    
    @Override
    protected void executePayment(double total) {
        System.out.println("Processing Alipay payment of " + total + " from account " + accountId);
    }
    
    @Override
    public void pay(double amount) {
        processPayment(amount);
    }
    
    @Override
    public String getType() {
        return "Alipay";
    }
}
