package com.gpengtao.spring4x;

import com.gpengtao.spring4x.model.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created by pengtao.geng on 2016/10/31.
 */
@Configuration
@ComponentScan
public class MyAppConfig {

    @Bean
    public Person aPerson() {
        Person person = new Person();
        person.setName("gpengtao");
        return person;
    }

    @Bean
    public InternalResourceViewResolver viewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/classes/views/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}
