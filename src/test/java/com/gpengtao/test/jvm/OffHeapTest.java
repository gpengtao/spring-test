package com.gpengtao.test.jvm;

import sun.nio.ch.DirectBuffer;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.nio.ByteBuffer;

/**
 * -XX:MaxDirectMemorySize=10M
 * <p>
 * Created by gpengtao on 16/6/30.
 */
public class OffHeapTest {

    public static void main(String[] args) {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName();
        System.out.println("当前进程的标识为：" + name);

        ByteBuffer byteBuffer = ByteBuffer.allocateDirect(100 * 1024 * 1024);
        if (byteBuffer.isDirect()) {
            ((DirectBuffer) byteBuffer).cleaner().clean();
        }
    }
}
