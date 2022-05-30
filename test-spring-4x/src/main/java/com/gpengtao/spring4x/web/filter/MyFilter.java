package com.gpengtao.spring4x.web.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * Created by pengtao.geng on 2016/11/3.
 */
@WebFilter(filterName = "myFilter", urlPatterns = "/*")
public class MyFilter implements Filter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void init(FilterConfig filterConfig) {
        logger.info("<<<<<<<<<<<<< MyFilter 初始化, config={}", filterConfig);
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        logger.info("=================== do filter ===============");
        chain.doFilter(request, response);
    }

    @Override
    public void destroy() {
        logger.info(">>>>>>>>>>>>>>> destroy my filter >>>>>>>>>>>>>>>>>>>>>>>");
    }
}
