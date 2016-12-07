package com.gpengtao.spring4x;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * 代码形式配置ContextLoaderListener和DispatchServlet的方式，可以类比web.xml方式的配置
 * <p>
 * 使用的容器是AnnotationConfigWebApplicationContext
 * Created by pengtao.geng on 2016/11/8.
 */
public class MySpringMvcWebInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    @Override
    protected Class<?>[] getRootConfigClasses() {
        // 父容器的配置类，如果没有就不构建父容器了
        return new Class<?>[]{};
    }

    @Override
    protected Class<?>[] getServletConfigClasses() {
        // servlet容器的的配置类
        return new Class<?>[]{MyAppConfig.class};
    }

    @Override
    protected String[] getServletMappings() {
        // servlet的mapping配置
        return new String[]{"/spring44x/*"};
    }
}
