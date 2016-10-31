package com.gpengtao.spring4x.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;

/**
 * Created by pengtao.geng on 2016/2/4.
 */
public class MyAppReadyListener implements ApplicationListener<ApplicationReadyEvent> {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void onApplicationEvent(ApplicationReadyEvent event) {
        logger.info("收到ApplicationReadyEvent事件：{}", event);
    }
}
