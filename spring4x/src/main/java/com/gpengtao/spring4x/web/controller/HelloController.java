package com.gpengtao.spring4x.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by pengtao.geng on 2016/11/1.
 */
@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/index")
    public String hello() {
        logger.info("view index");
        return "index";
    }
}
