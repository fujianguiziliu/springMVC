package com._520it.springMVC.hello;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import com._520it.springMVC.domain.UserInfo;

@org.springframework.stereotype.Controller
public class ValueController implements Controller{

	@RequestMapping("/value1")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		request.setAttribute("msg", "下雨le..............");
		request.getRequestDispatcher("/msg.jsp").forward(request, response);
		return null;
	}

	@RequestMapping("/value2")
	public ModelAndView handleRequest2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		//第一种方式，两个参数类型
		mv.addObject("msg", "今天正式宣布....");
		//第二种，map类型
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("name", "chris");
		modelMap.put("age", "35");
		mv.addAllObjects(modelMap);
		//第三种，一个参数类型
		mv.addObject("多读书，读好书");//此时没有key，springMVC会应用默认的key，默认key是类型的首字母的小写，为string
		mv.addObject(new UserInfo("admin","25"));//默认key:userInfo
		mv.addObject(new UserInfo("tom","666"));//默认key:userInfo,会覆盖前面的"admin","25"
		mv.setViewName("forward:/msg.jsp");		
		return mv;
	}
	@RequestMapping("/value3")
	public UserInfo value3(){
		return new UserInfo("admin","123");
	}
	
	@RequestMapping("/value4")
	//当返回值为string类型的时候，返回值不是模型，而是试图地址
	//此时的试图地址为/WebContent/WEB-INF/views/haha.jsp
	public String value4(Model model){
		model.addAttribute("msg", "返回类型string");
		return "haha";
	}
	
	@RequestMapping("/value5")
	//当返回值为string类型的时候，返回值不是模型，而是试图地址
	//此时的试图地址为/WebContent/WEB-INF/views/haha.jsp
	public String value5(Model model){
		model.addAttribute("msg", "返回类型string1");
		return "redirect:/input.jsp";
	}
}
