package com.gpengtao.spring4x.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Created by pengtao.geng on 2016/10/31.
 */
@Service
public class SayHelloService {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public void sayHello() {
        logger.info("hello");
    }
}
