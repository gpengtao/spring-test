package com.gpengtao.spring4x;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.WebApplicationInitializer;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.DispatcherServlet;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRegistration;

/**
 * WebApplicationInitializer是对servlet3.0 SPI启动spring的最底层接口
 * <p>
 * Created by pengtao.geng on 2016/11/1.
 */
public class MySpringWebInitializer implements WebApplicationInitializer {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {

        logger.info("<<<<<<<<<<<<< My Spring Web Initializer准备启动 <<<<<<<<<<<<<");

        AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
        context.register(MyAppConfig.class);
        context.setServletContext(servletContext);

        ServletRegistration.Dynamic servlet = servletContext.addServlet("mvcServlet", new DispatcherServlet(context));
        servlet.addMapping("/spring4x/*");
        servlet.setLoadOnStartup(1);
    }

}
