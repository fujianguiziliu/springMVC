package com._520it.springMVC.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller//这个注解作用:标记这个类是使用注解的方式配置URL信息
@RequestMapping("/all")
public class AnnoController {
	@RequestMapping("/anno")
	public ModelAndView anno(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello,anno");
		return null;
	}
	@RequestMapping("/anno2")
	public ModelAndView anno2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello,anno2");
		return null;
	}
	@RequestMapping("/anno3")
	public ModelAndView anno3(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello,anno3");
		return null;
	}
	@RequestMapping("/anno4")
	public ModelAndView anno4(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello,anno4");
		return null;
	}
	
}
