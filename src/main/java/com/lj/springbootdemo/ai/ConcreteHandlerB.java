package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class ConcreteHandlerB extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("requestB".equals(request)) {
            System.out.println("ConcreteHandlerB handles request: " + request);
        } else {
            System.out.println("ConcreteHandlerB passes request to next handler");
            handleNext(request);
        }
    }
}
