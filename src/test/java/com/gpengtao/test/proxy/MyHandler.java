package com.gpengtao.test.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pengtao.geng on 2016/6/27.
 */
public class MyHandler implements InvocationHandler{

    private Object target;

    public MyHandler(SayHello sayHello) {
        target = sayHello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object result = method.invoke(target, args);

        return result;
    }
}
