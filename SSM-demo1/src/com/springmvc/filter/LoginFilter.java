package com.springmvc.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LoginFilter implements Filter {
	 
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}
 
	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		HttpSession session = request.getSession();
		Object LOGIN_USER = session.getAttribute("LOGIN_USER");
		//&& request.getRequestURI().indexOf("/system/login") == -1
		String uri = request.getRequestURI(); 
		if(LOGIN_USER==null&& uri.indexOf("/html/login.html") == -1){
			// 没有登录
			System.out.println("进来了过滤器");
			//request.getRequestDispatcher("/SSM-demo1/html/login.html?id=1").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/html/login.html");
		}else{
			// 已经登录，继续请求下一级资源（继续访问）
			arg2.doFilter(arg0, arg1);
		}
		
	}
 
	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}
}