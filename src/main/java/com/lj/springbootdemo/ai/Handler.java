package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public abstract class Handler {

    protected Handler nextHandler;

    public void setNextHandler(Handler nextHandler) {
        this.nextHandler = nextHandler;
    }

    public abstract void handleRequest(String request);

    protected void handleNext(String request) {
        if (nextHandler != null) {
            nextHandler.handleRequest(request);
        }
    }
}
