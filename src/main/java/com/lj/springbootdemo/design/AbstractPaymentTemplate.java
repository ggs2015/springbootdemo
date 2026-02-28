package com.lj.springbootdemo.design;

public abstract class AbstractPaymentTemplate implements PaymentStrategy {
    
    public final void processPayment(double amount) {
        if (!validateAmount(amount)) {
            System.out.println("Invalid amount: " + amount);
            return;
        }
        double fee = calculateFee(amount);
        double total = amount + fee;
        executePayment(total);
        sendNotification(total);
    }
    
    protected boolean validateAmount(double amount) {
        return amount > 0 && amount <= 100000;
    }
    
    protected abstract double calculateFee(double amount);
    
    protected abstract void executePayment(double total);
    
    protected void sendNotification(double total) {
        System.out.println("Payment of " + total + " completed. Notification sent.");
    }
}
