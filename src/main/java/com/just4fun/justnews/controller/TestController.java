package com.just4fun.justnews.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {
    @RequestMapping(value = "/hello")
    @ResponseBody
    public String sayHello(){
        return "hello world";
    }
}
