package com.gpengtao.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by gpengtao on 16/1/22.
 */
@Service
public class HelloService {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    public HelloService() {
        logger.info("=========HelloService初始化完成=======");
    }

    public void sayHello() {

    }
}
