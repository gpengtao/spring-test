package com.gpengtao.test.spring;

import org.junit.Test;
import org.springframework.core.env.StandardEnvironment;

/**
 * Created by pengtao.geng on 2016/2/4.
 */
public class EnvironmentTest {

    @Test
    public void test_environment() {
        StandardEnvironment environment = new StandardEnvironment();
        System.out.println(environment);
    }
}
