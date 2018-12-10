package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot将所有的功能场景都抽取出来，做成一个个的starters(启动器)。要用什么功能就导入什么场景的启动器。
 * 
 * @SpringBootApplication：说明这是一个SpringBoot应用
 * @SpringBootConfiguration：表示这是一个SpringBoot的配置类
 * @EnableAutoConfiguration：开启自动配置功能(比如我们没有配置SpringMVC，但是可以使用SpringMVC的功能)
 * @AutoConfigurationPackage：将主配置类(@SpringBootApplication标注的类)的所在的包及下面所有子包里面的所有组件扫描到Spring容器
 * 
 * AutoConfigurationImportSelector：SpringBoot启动时从类路径下的META-INF/spring.factories中获取EnableAutoConfiguration指定的值
 *
 * @ImportResource(locations = {"classpath:beans.xml"})：导入Spring的配置文件
 */

// @ImportResource(locations = {"classpath:beans.xml"}) 

@SpringBootApplication
//@MapperScan("com.example.mapper")
public class DemoApplication {

	public static void main(String[] args) {
	    // Spring应用启动
		SpringApplication.run(DemoApplication.class, args);
	}
}
