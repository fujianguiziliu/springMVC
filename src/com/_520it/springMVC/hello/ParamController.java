package com._520it.springMVC.hello;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com._520it.springMVC.domain.UserInfo;

@Controller
public class ParamController {
	@RequestMapping("/param1")
	public ModelAndView handleRequest(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		System.out.println("hello,anno");
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		UserInfo info = new UserInfo(username,password);
		System.out.println(info);
		return null;
	}
	
	@RequestMapping("/param2")
	public ModelAndView handleRequest2(String username,String password) throws Exception {
		System.out.println("hello,anno2");
		UserInfo info = new UserInfo(username,password);
		System.out.println(info);
		return null;
	}
	
	@RequestMapping("/param3")
	//���ǰ̨���Ǹ�����nameɾ��������ô�ͻᱨ��( Required String parameter 'name' is not present)
	//��ʱ�͵���required=false���������� name���Բ��Ǳ����,���Բ�д
	//Ҳ������defaultValue="paul"���Զ���д�����name�������Ƶ�valueֵ
	public ModelAndView handleRequest3(@RequestParam(value="name",required=false,defaultValue="paul")String username,String password) throws Exception {
		System.out.println("hello,anno3");
		UserInfo info = new UserInfo(username,password);
		System.out.println(info);
		return null;
	}
	
	@RequestMapping("/param4")
	public ModelAndView handleRequest4(UserInfo info) throws Exception {
		System.out.println("hello,anno4");
		
		System.out.println(info);
		return null;
	}
	@RequestMapping("/delete/{delId}")
	//http://localhost:8080/delete/5�����5��id����ʱ�͵ü�ע��@PathVariable("delId")��delId��Ҫд��ȥ�Ĳ�Ȼ��֪�����ĸ�����
	public ModelAndView handleRequest5(@PathVariable("delId")Long id) throws Exception {
		System.out.println("hello,anno5.delete()--->" + id);
		return null;
	}
	
	}
