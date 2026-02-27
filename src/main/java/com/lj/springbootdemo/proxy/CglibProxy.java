package com.lj.springbootdemo.proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * @author liujun
 * @date 2025/2/25
 */
public class CglibProxy implements MethodInterceptor {

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("CglibProxy: Before method - " + method.getName());
        Object result = proxy.invokeSuper(obj, args);
        System.out.println("CglibProxy: After method - " + method.getName());
        return result;
    }

    public static <T> T createProxy(Class<T> targetClass) {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(targetClass);
        enhancer.setCallback(new CglibProxy());
        return (T) enhancer.create();
    }
}
