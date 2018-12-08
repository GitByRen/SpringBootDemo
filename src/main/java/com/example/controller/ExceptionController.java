package com.example.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class ExceptionController {

	@ExceptionHandler(UserNotFoundException.class)
	public String handleException(Exception e, HttpServletRequest request) {
		Map<String, Object> map = new HashMap<>();
		// 传入我们自己的错误状态码，否则就不会进入错误页面
		request.setAttribute("javax.servlet.error.status", 500);
		map.put("code", "user.notexist");
		map.put("message", e.getMessage());
		return "forward:/error";
	}
	
}


class UserNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;
	
}