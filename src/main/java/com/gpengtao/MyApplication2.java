package com.gpengtao;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by gpengtao on 16/2/3.
 */
@SpringBootApplication
public class MyApplication2 {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyApplication2.class);
        app.setBannerMode(Banner.Mode.OFF);

    }
}
