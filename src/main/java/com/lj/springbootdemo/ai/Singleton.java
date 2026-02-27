package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class Singleton {

    private Singleton() {
    }

    private static class SingletonHolder {
        private static final Singleton INSTANCE = new Singleton();
    }

    public static Singleton getInstance() {
        return SingletonHolder.INSTANCE;
    }

    public void doSomething() {
        System.out.println("Singleton pattern implementation");
    }
}
