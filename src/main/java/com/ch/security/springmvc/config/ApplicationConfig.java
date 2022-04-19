package com.ch.security.springmvc.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.stereotype.Controller;

/**
 * @classname: ApplicationConfig
 * @description: 对应web.xml中的ContextLoaderListener的配置
 * @author: h_chen
 * @create: 2022/4/19 0018 下午 11:44
 */
@Configuration
@ComponentScan(basePackages = "com.ch.security.springmvc"
            ,excludeFilters = {@ComponentScan.Filter(type = FilterType.ANNOTATION,value = Controller.class)})
public class ApplicationConfig {
    //在此配置除了Controller的其他bean，比如：数据库连接池，事务管理器，业务bean等。
}
