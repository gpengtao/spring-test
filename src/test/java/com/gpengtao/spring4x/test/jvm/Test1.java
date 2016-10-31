package com.gpengtao.spring4x.test.jvm;

/**
 * -XX:+PrintGCDetails -Xms20m -Xmx20m -Xmn10m
 * Created by gpengtao on 16/6/17.
 */
public class Test1 {
    static int m = 1024 * 1024;

    public static void main(String[] args) {
        //分配2兆
//        byte[] a1 = new byte[2 * m];
//        System.out.println("a1 ok");
        //分配2兆
//        byte[] a2 = new byte[4 * m];
//        System.out.println("a2 ok");
        System.out.println("xxxx");
    }
}
