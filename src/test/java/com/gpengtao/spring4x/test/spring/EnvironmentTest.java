package com.gpengtao.spring4x.test.spring;

import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * Created by pengtao.geng on 2016/2/4.
 */
public class EnvironmentTest {

    @Test
    public void test_environment() {
        StandardEnvironment environment = new StandardEnvironment();
        System.out.println(environment);
    }

    @Test
    public void test_url() throws IOException {
        URL url = new URL("http://www.baidu.com");
        InputStream inputStream = url.openStream();
        System.out.println(inputStream);
    }
}
