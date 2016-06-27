package com.gpengtao.test.spring;

import com.gpengtao.test.context.SpringUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by pengtao.geng on 2016/6/27.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/test-beans.xml"})
public class TestApp2 {

    @Test
    public void test() {
        Object user = SpringUtil.context.getBean("user");
        System.out.println(user);

        Object userFactory = SpringUtil.context.getBean("&user");
        System.out.println(userFactory);
    }
}
