package com.gpengtao.spring4x.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by pengtao.geng on 2016/12/7.
 */
@Controller
public class SSEController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping(value = "/sse", produces = "text/event-stream")
    @ResponseBody
    public String sse() throws InterruptedException {
        logger.info("访问sse接口");
        Thread.sleep(1000);

        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return "data:" + format.format(new Date()) + "\r\n";
    }
}
