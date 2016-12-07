package com.gpengtao.spring4x.web.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

/**
 * Created by pengtao.geng on 2016/11/1.
 */
@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @RequestMapping("/index")
    public String index() {
        logger.info("==================== view index =====================");
        return "index";
    }

    @RequestMapping("/hello")
    @ResponseBody
    public Object hello() {
        logger.info("==================== view hello =====================");
        return "hello";
    }

    @RequestMapping("/sse")
    @ResponseBody
    public ModelAndView sse() {
        logger.info("==================== view hello =====================");
        return new ModelAndView("sse");
    }

}
