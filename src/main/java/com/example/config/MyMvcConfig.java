package com.example.config;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.example.component.LoginInterceptor;

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
	@Bean
	public WebMvcConfigurer webMvcConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addViewControllers(ViewControllerRegistry registry) {
				registry.addViewController("/").setViewName("index");
				registry.addViewController("/index.html").setViewName("index");
				registry.addViewController("/main.html").setViewName("dashboard");
			}

			@Override
			public void addInterceptors(InterceptorRegistry registry) {
				registry.addInterceptor(new LoginInterceptor()).addPathPatterns("/**")
						.excludePathPatterns("/index.html", "/", "/user/login", "/webjars/**", "/asserts/**");
			}
		};
	}

	// 自定义LocaleResolver组件
	@Bean
	public LocaleResolver localeResolver() {
		return new LocaleResolver() {
			@Override
			public Locale resolveLocale(HttpServletRequest request) {
				String l = request.getParameter("l");
				Locale locale = Locale.getDefault();
				if (!StringUtils.isEmpty(l)) {
					String[] split = l.split("_");
					locale = new Locale(split[0], split[1]);
				}
				return locale;
			}

			@Override
			public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

			}
		};
	}
}
