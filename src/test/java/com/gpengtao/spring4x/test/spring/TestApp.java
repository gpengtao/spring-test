package com.gpengtao.spring4x.test.spring;

import org.junit.Test;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.core.io.ClassPathResource;

/**
 * Created by gpengtao on 16/6/15.
 */
public class TestApp {

    @Test
    public void test_bean_factory() {

        // 目标bean factory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // beanDefinition的resource
        ClassPathResource resource = new ClassPathResource("test-beans.xml");
        System.out.println("resource: " + resource);

        // 读取definition的resource,并注册到factory
        XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(beanFactory);
        reader.loadBeanDefinitions(resource);

        // 获取bean
        System.out.println("bean factory: " + beanFactory);
        Object xiaoMing = beanFactory.getBean("xiaoMing");

        System.out.println("user bean: " + xiaoMing);
    }
}
