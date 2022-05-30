package com.gpengtao.spring4x.web.listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * servlet3.0的listener
 * <p>
 * Created by pengtao.geng on 2016/11/3.
 */
@WebListener
public class MyListener implements ServletContextListener {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        logger.info("<<<<<<<<<<<<<< My listener start <<<<<<<<<<<<<<<<<<<<<<<");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        logger.info(">>>>>>>>>>>>>>> My lister end  >>>>>>>>>>>>>>>>>>>>>>>");
    }
}
