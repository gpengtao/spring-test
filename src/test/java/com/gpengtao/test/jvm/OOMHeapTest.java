package com.gpengtao.test.jvm;

import java.util.ArrayList;
import java.util.List;

/**
 * -Xms20m -Xmx20m -XX:+HeapDumpOnOutOfMemoryError
 * <p>
 * Created by gpengtao on 16/6/18.
 */
public class OOMHeapTest {

    public static void main(String[] args) {
        List<OOMObject> list = new ArrayList<OOMObject>();

        while (true) {
            list.add(new OOMObject());
            System.out.println(list.size());
        }

    }

    static class OOMObject {
        private byte[] obj = new byte[1024 * 1024];
    }
}
