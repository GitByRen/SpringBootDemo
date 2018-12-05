package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HelloController {

    @Value("${person.last-name}")
    private String name;
    
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "hello quick";
    }

    /**
     * 如果只是在某个业务逻辑中需要获取一下配置文件中的某项值，使用@Value
     * 如果我们专门写了一个JavaBean来和配置文件进行映射，我们直接使用@ConfigurationProperties
     */
    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello:" + name;
    }
    
    // 测试模板引擎
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        return "success";
    }

}
