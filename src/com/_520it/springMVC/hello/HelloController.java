package com._520it.springMVC.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

public class HelloController implements Controller{

	@Override
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello");
		ModelAndView mv = new ModelAndView();
		mv.setViewName("/msg.jsp");//设置视图名称
		mv.addObject("msg", "东坡真帅");//设置模型数据
		return mv;
	}

}
