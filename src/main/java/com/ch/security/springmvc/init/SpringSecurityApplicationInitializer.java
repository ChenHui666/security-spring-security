package com.ch.security.springmvc.init;

import com.ch.security.springmvc.config.WebSecurityConfig;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;

/**
 * @classname: SpringSecurityApplicationInitializer
 * @description: spring-security初始化
 * @author: h_chen
 * @create: 2022/4/19 0019 下午 1:46
 */
public class SpringSecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {
    public SpringSecurityApplicationInitializer() {
        //如果使用的不是springmvc或者是pring的框架要加上下面语句
//        super(WebSecurityConfig.class);
    }
}
