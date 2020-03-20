package com.lch.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * 声明这是一个控制类
 * 主要负责业务逻辑 请求分发 。。。
 */
@Controller
public class DemoController {


    /**
     * 请求名字与方法名字的映射来找到这个方法
     * @return 111
     */
    @RequestMapping("/hello")
    @ResponseBody//代表返回的是一个JSON
    public String test() {
        return "Hello World";
    }
}
