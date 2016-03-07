package com.gpengtao.model;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by pengtao.geng on 2016/3/7.
 */
@Component
@ConfigurationProperties(prefix = "connection")
public class Config {
}
