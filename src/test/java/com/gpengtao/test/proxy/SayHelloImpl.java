package com.gpengtao.test.proxy;

/**
 * Created by pengtao.geng on 2016/6/27.
 */
public class SayHelloImpl implements SayHello {

    @Override
    public void say() {
        System.out.println("========= hello ========");
    }
}
