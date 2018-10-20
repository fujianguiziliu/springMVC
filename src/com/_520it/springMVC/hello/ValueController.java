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
		request.setAttribute("msg", "����le..............");
		request.getRequestDispatcher("/msg.jsp").forward(request, response);
		return null;
	}

	@RequestMapping("/value2")
	public ModelAndView handleRequest2(HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		ModelAndView mv = new ModelAndView();
		//��һ�ַ�ʽ��������������
		mv.addObject("msg", "������ʽ����....");
		//�ڶ��֣�map����
		Map<String, Object> modelMap = new HashMap<String, Object>();
		modelMap.put("name", "chris");
		modelMap.put("age", "35");
		mv.addAllObjects(modelMap);
		//�����֣�һ����������
		mv.addObject("����飬������");//��ʱû��key��springMVC��Ӧ��Ĭ�ϵ�key��Ĭ��key�����͵�����ĸ��Сд��Ϊstring
		mv.addObject(new UserInfo("admin","25"));//Ĭ��key:userInfo
		mv.addObject(new UserInfo("tom","666"));//Ĭ��key:userInfo,�Ḳ��ǰ���"admin","25"
		mv.setViewName("forward:/msg.jsp");		
		return mv;
	}
	@RequestMapping("/value3")
	public UserInfo value3(){
		return new UserInfo("admin","123");
	}
	
	@RequestMapping("/value4")
	//������ֵΪstring���͵�ʱ�򣬷���ֵ����ģ�ͣ�������ͼ��ַ
	//��ʱ����ͼ��ַΪ/WebContent/WEB-INF/views/haha.jsp
	public String value4(Model model){
		model.addAttribute("msg", "��������string");
		return "haha";
	}
	
	@RequestMapping("/value5")
	//������ֵΪstring���͵�ʱ�򣬷���ֵ����ģ�ͣ�������ͼ��ַ
	//��ʱ����ͼ��ַΪ/WebContent/WEB-INF/views/haha.jsp
	public String value5(Model model){
		model.addAttribute("msg", "��������string1");
		return "redirect:/input.jsp";
	}
}
