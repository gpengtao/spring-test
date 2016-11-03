package com.gpengtao.spring4x;

import org.junit.Test;

import javax.servlet.ServletContainerInitializer;
import java.util.ServiceLoader;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void test_spi() {
        ServiceLoader<ServletContainerInitializer> loader = ServiceLoader.load(ServletContainerInitializer.class);

        for (ServletContainerInitializer service : loader) {
            System.out.println(service);
        }
    }
}
