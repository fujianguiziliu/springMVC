package com._520it.springMVC.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class MyInterceptor implements HandlerInterceptor{
	
 /**
 * @param request
 * @param response
 * @param handler 控制器执行之前调用
 * @return 返回false，表示拦截请求，返回true，表示放行
 * @throws Exception
 */
@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
	System.out.println("MyInterceptor.preHandle()");
		return true;
	}

 /**
 * @param request
 * @param response
 * @param handler
 * @param modelAndView
 * @throws Exception
 * 控制器方法执行后，视图和模型合成之前调用
 */
@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
	System.out.println("MyInterceptor.postHandle()");
		
	}

	/**
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * 控制器方法执行后，视图和模型合成之后调用
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("MyInterceptor.afterCompletion()");
	}

}
