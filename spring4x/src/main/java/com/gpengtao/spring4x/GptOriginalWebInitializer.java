package com.gpengtao.spring4x;

import com.gpengtao.spring4x.context.GptWebInit;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * 最原生的启动方式
 * 直接实现servlet3.0的接口，容器initialize时候调用此类，需要配置SPI (Service Provider Interface)
 * <p>
 * Created by pengtao.geng on 2016/11/3.
 */
@HandlesTypes(GptWebInit.class)
public class GptOriginalWebInitializer implements ServletContainerInitializer {

	private Logger logger = LoggerFactory.getLogger(this.getClass());

	@Override
	public void onStartup(Set<Class<?>> c, ServletContext ctx) {
		logger.info("GptOriginalWebInitializer,原始用法ServletContainerInitializer,收到的参数:class={},servletContext={}", c, ctx);
		for (Class<?> aClass : c) {
			logger.info("class是: {}", aClass);
		}
	}
}
