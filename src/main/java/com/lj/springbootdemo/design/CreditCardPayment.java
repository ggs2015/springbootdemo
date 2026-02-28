package com.lj.springbootdemo.design;
public class CreditCardPayment extends AbstractPaymentTemplate {
    
    private final String cardNumber;
    
    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    
    @Override
    protected double calculateFee(double amount) {
        return amount * 0.02;
    }
    
    @Override
    protected void executePayment(double total) {
        System.out.println("Processing credit card payment of " + total + " using card ending with " + cardNumber.substring(cardNumber.length() - 4));
    }
    
    @Override
    public void pay(double amount) {
        processPayment(amount);
    }
    
    @Override
    public String getType() {
        return "Credit Card";
    }
}
