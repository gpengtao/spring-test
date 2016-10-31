package com.gpengtao.spring4x.test.jvm;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * Created by gpengtao on 16/6/18.
 */
public class OOMHeapTest {

    public static void main(String[] args) throws InterruptedException {
        RuntimeMXBean runtime = ManagementFactory.getRuntimeMXBean();
        String name = runtime.getName();
        System.out.println("当前进程的标识为："+name);

        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
            System.out.println(list.size());
            Thread.sleep(5000);
        }
    }

    static class OOMObject {
        private byte[] obj = new byte[1024 * 1024];
    }
}
