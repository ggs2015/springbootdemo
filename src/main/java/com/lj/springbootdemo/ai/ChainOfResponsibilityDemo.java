package com.lj.springbootdemo.ai;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class ChainOfResponsibilityDemo {

    public static void main(String[] args) {
        Handler handlerA = new ConcreteHandlerA();
        Handler handlerB = new ConcreteHandlerB();
        Handler handlerC = new ConcreteHandlerC();

        handlerA.setNextHandler(handlerB);
        handlerB.setNextHandler(handlerC);

        System.out.println("=== Processing requestA ===");
        handlerA.handleRequest("requestA");

        System.out.println("\n=== Processing requestB ===");
        handlerA.handleRequest("requestB");

        System.out.println("\n=== Processing requestC ===");
        handlerA.handleRequest("requestC");

        System.out.println("\n=== Processing unknownRequest ===");
        handlerA.handleRequest("unknownRequest");
    }
}
