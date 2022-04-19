package com.ch.security.springmvc.init;

import com.ch.security.springmvc.config.ApplicationConfig;
import com.ch.security.springmvc.config.WebConfig;
import com.ch.security.springmvc.config.WebSecurityConfig;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * @classname: SpringApplicationInitializer
 * @description: 加载Spring容器
 * @author: h_chen
 * @create: 2022/4/19 0019 上午 12:08
 */
public class SpringApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    /**
     * spring容器，相当于加载applicationContext.xml
     */
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{ApplicationConfig.class, WebSecurityConfig.class};
    }

    /**
     * servletContext，相当于加载springmvc.xml
     */
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{WebConfig.class};
    }

    /**
     * url-mapping
     */
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
