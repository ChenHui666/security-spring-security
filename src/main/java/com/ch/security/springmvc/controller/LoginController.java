package com.ch.security.springmvc.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

/**
 * @classname: LoginController
 * @description: LoginController
 * @author: h_chen
 * @create: 2022/4/19 0019 下午 1:53
 */
@RestController
public class LoginController {

    @RequestMapping(value = "loginSuccess",produces = {"text/plain;charset=utf-8"})
    public String loginSuccess(){
        return "登录成功";
    }

    @GetMapping(value = "/r/r1",produces = {"text/plain;charset=utf-8"})
    public String r1(){
        return "访问r1资源";
    }

    @GetMapping(value = "/r/r2",produces = {"text/plain;charset=utf-8"})
    public String r2(){
        return "访问r2资源";
    }
}
