package com.gpengtao;

import com.gpengtao.listener.MyAppReadyListener;
import com.gpengtao.listener.MyAppEventListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by gpengtao on 16/1/22.
 */
@Configuration
@EnableAutoConfiguration
@ComponentScan
@ImportResource("/beans.xml")
public class MyApplication {

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(MyApplication.class);
        app.setBannerMode(Banner.Mode.CONSOLE);
        app.addListeners(new MyAppEventListener(), new MyAppReadyListener());
        app.setWebEnvironment(true);
        app.run(args);
    }
}
