package com.gpengtao.spring4x.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * 实现spring的listener，未指定监听的event类型，所以会监听到所有spring boot及spring context的event
 * <p/>
 * Created by pengtao.geng on 2016/2/4.
 */
public class MyAppEventListener implements ApplicationListener {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public void onApplicationEvent(ApplicationEvent event) {
        logger.info("收到event：{}", event);
    }
}
