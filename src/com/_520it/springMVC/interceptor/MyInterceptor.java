package com._520it.springMVC.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;



public class MyInterceptor implements HandlerInterceptor{
	
 /**
 * @param request
 * @param response
 * @param handler ������ִ��֮ǰ����
 * @return ����false����ʾ�������󣬷���true����ʾ����
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
 * ����������ִ�к���ͼ��ģ�ͺϳ�֮ǰ����
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
	 * ����������ִ�к���ͼ��ģ�ͺϳ�֮�����
	 */
	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		System.out.println("MyInterceptor.afterCompletion()");
	}

}
