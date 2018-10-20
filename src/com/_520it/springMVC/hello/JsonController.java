package com._520it.springMVC.hello;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com._520it.springMVC.domain.UserInfo;

@Controller//这个注解作用:标记这个类是使用注解的方式配置URL信息
public class JsonController{
		@RequestMapping("/json")
		@ResponseBody
		public UserInfo getJSON(){
			return new UserInfo("admin","123",new Date());
			
		}
		@RequestMapping("/param5")
		public void param5(UserInfo userInfo){
			System.out.println(userInfo);
		}
		@InitBinder
		public void initBinder(WebDataBinder binder){
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			sdf.setLenient(false);
			binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
	}

}
