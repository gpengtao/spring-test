package com.gpengtao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pengtao.geng on 2016/6/3.
 */
@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    public String home() {
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class);
    }
}
