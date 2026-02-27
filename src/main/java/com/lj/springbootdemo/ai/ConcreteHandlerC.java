package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class ConcreteHandlerC extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("requestC".equals(request)) {
            System.out.println("ConcreteHandlerC handles request: " + request);
        } else {
            System.out.println("ConcreteHandlerC cannot handle request: " + request);
        }
    }
}
