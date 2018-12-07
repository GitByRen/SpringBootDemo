package com.example.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 既保留了所有的自动配置，也能用我们扩展的配置
 */

// 实现WebMvcConfigurer可以来扩展SpringMvc的功能
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {

	@Override
	public void addViewControllers(ViewControllerRegistry registry) {
		// 配置直接转发的页面，相当于<mvc:view-controller path="/atguigu" view-name="success"/>
		registry.addViewController("/atguigu").setViewName("success");
	}
	
	// 让所有的组件一起生效
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("index");
				registry.addViewController("/index.html").setViewName("index");
			}
		};
	}
}
