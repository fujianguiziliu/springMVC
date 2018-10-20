package com._520it.springMVC.hello;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class FileController{

	@RequestMapping("/upload")
	public void upload(MultipartFile  file) throws Exception {
		System.out.println(file.getContentType());
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getSize());
		FileOutputStream os = new FileOutputStream("E:/a.txt");
		IOUtils.copy(file.getInputStream(), os);
		os.close();
	}
	
	@RequestMapping("/download")
	public void download(HttpServletResponse  response) {
		FileInputStream is = null;
		try {
			String fileName = new String("逗比".getBytes("utf-8"),"ISO8859-1");
			response.setHeader("Content-Disposition", "attachment;filename="+fileName+".jpg");
			is = new FileInputStream("E:/a.jpg");
			//响应到客户端
			IOUtils.copy(is, response.getOutputStream());
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			if (is!=null) {
				try {
					is.close();
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
	}
}
