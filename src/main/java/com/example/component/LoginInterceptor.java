package com.example.component;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

	// 目标方法执行之前
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		Object user = request.getSession().getAttribute("loginUser");
		if (user == null) {
			// 未登录
			request.setAttribute("msg", "没有权限请先登录!");
			request.getRequestDispatcher("/index.html").forward(request, response);
			return false;
		}
		return true;
	}

}
