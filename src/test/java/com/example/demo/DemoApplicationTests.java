package com.example.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.bean.Person;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Autowired
    Person             person;

    @Autowired
    ApplicationContext ioc;

    @Test
    public void testHelloService() {
        boolean containsBean = ioc.containsBean("helloService");
        System.out.println(containsBean);
    }

    @Test
    public void contextLoads() {
        System.out.println(person);
    }

}
