package com._520it.springMVC.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com._520it.springMVC.domain.UserInfo;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JSONTest{

	public static void main(String[] args) throws Exception{
		ObjectMapper mapper = new ObjectMapper();
		String str = mapper.writeValueAsString(new UserInfo("admin","236"));
		System.out.println(str);
	}

}
