package com.springmvc.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

public class LoginInterceptor implements HandlerInterceptor {
	 
	@Override
	public void afterCompletion(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		// 执行完毕，返回前拦截		
	}
 
	@Override
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1, Object arg2, ModelAndView arg3)
			throws Exception {
		// 在处理过程中，执行拦截		
	}
 
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object arg2) throws Exception {
		// 在拦截点执行前拦截，如果返回true则不执行拦截点后的操作（拦截成功）
		// 返回false则不执行拦截
		//HttpSession session = request.getSession();
		//String uri = request.getRequestURI(); // 获取登录的uri，这个是不进行拦截的
		//if(session.getAttribute("LOGIN_USER")!=null || uri.indexOf("system/login")!=-1) {// 说明登录成功 或者 执行登录功能			
		/*if(session.getAttribute("LOGIN_USER")!=null) {
			//登录成功不拦截
			return true;
		}else {
			// 拦截后进入登录页面
			System.out.println("进来了拦截器");
			//request.getRequestDispatcher("/SSM-demo1/html/login.html?id=1").forward(request, response);
			response.sendRedirect(request.getContextPath()+"/html/login.html?id=拦截器");
			return false;
		}*/
		return true;
	}
}
