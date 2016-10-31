package com.gpengtao.spring4x.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * Created by pengtao.geng on 2016/6/27.
 */
public class TestMain {

    public static void main(String[] args) {

        SayHello sayHelloImpl = new SayHelloImpl();

        InvocationHandler myHandler = new MyHandler(sayHelloImpl);

        // 获取classLoader
        ClassLoader classLoader = SayHello.class.getClassLoader();
        // 获取目标对象实现的接口
        Class<?>[] interfaces = sayHelloImpl.getClass().getInterfaces();

        // 生成代理类
        SayHello proxyInstance = (SayHello) Proxy.newProxyInstance(classLoader, interfaces, myHandler);

        proxyInstance.say();
    }
}
