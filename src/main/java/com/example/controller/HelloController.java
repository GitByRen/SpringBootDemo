package com.example.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.config.Enable.EnableCache;

@RestController
@EnableCache
public class HelloController {

    @Value("${person.last-name}")
    private String name;
    
    @RequestMapping("/hello")
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
    
    @RequestMapping("/success")
    public String success(Map<String, Object> map) {
        map.put("hello", "你好");
        return "success";
    }

}
