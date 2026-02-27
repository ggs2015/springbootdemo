package com.lj.springbootdemo.proxy;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class ProxyTest {

    public static void main(String[] args) {
        System.out.println("=== JDK Dynamic Proxy Test ===");
        testJdkDynamicProxy();

        System.out.println("\n=== CGLib Dynamic Proxy Test ===");
        testCglibDynamicProxy();
    }

    public static void testJdkDynamicProxy() {
        UserService target = new UserServiceImpl();
        UserService proxy = JdkDynamicProxy.createProxy(target);

        proxy.addUser("Alice");
        proxy.deleteUser("Bob");
    }

    public static void testCglibDynamicProxy() {
        UserServiceImpl proxy = CglibProxy.createProxy(UserServiceImpl.class);

        proxy.addUser("Charlie");
        proxy.deleteUser("David");
    }
}
