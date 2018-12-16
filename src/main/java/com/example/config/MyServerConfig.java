package com.example.config;

import java.util.Arrays;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.servlet.MyFilter;
import com.example.servlet.MyServlet;

@Configuration
public class MyServerConfig {

	// 自定义Servlet容器的配置
	@Bean
	public WebServerFactoryCustomizer<ConfigurableWebServerFactory> customizer() {
		return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>() {
			@Override
			public void customize(ConfigurableWebServerFactory factory) {
				// factory.setPort(9999);
			}
		};
	}

	
	// 注册三大组件
	@Bean
	public ServletRegistrationBean<MyServlet> myServlet() {
		return new ServletRegistrationBean<>(new MyServlet(), "/myServlet");
	}
	
	@Bean
	public FilterRegistrationBean<MyFilter> myFilter() {
		FilterRegistrationBean<MyFilter> filterRegistrationBean = new FilterRegistrationBean<>();
		filterRegistrationBean.setFilter(new MyFilter());
		filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello", "/myListener"));
		return filterRegistrationBean;
	}
	
}
