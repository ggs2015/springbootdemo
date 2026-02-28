package com.lj.springbootdemo.design;
public interface PaymentStrategy {
    void pay(double amount);
    String getType();
}
