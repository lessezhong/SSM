package com.springmvc.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import pojo.StudentInfoMapper;

//url:  http://localhost:8080/HelloSpringMVC/hello/mvc

@Controller
// 告诉DispatcherServlet相关的容器， 这是一个Controller，
@RequestMapping(value = "/hello")
// 类级别的RequestMapping，告诉DispatcherServlet由这个类负责处理以及URL。HandlerMapping依靠这个标签来工作
public class HelloController {
	@Resource
	private StudentInfoMapper studentMapper = null;

	// 方法级别的RequestMapping， 限制并缩小了URL路径匹配，同类级别的标签协同工作，最终确定拦截到的URL由那个方法处理
	// 并指定访问方法为GET
	@RequestMapping(value = "/mvc", method = RequestMethod.GET)
	// public String HelloWorld(Model model,
	// @RequestParam("uname") String username,
	// @RequestParam("pwd") String password) {
	public String HelloWorld(Model model) {
		// Logger logger = Logger.getLogger(HelloController.class);
		model.addAttribute("message", "总记录=" + studentMapper.getStudentCount()); // 传参数给前端
		// 视图渲染，/WEB-INF/view/HelloWorld.jsp
		return "HelloWorld"; // 页面的名称，根据此字符串会去寻找名为HelloWorld.jsp的页面
	}
}
