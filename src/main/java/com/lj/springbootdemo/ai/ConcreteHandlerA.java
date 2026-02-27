package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class ConcreteHandlerA extends Handler {

    @Override
    public void handleRequest(String request) {
        if ("requestA".equals(request)) {
            System.out.println("ConcreteHandlerA handles request: " + request);
        } else {
            System.out.println("ConcreteHandlerA passes request to next handler");
            handleNext(request);
        }
    }
}
