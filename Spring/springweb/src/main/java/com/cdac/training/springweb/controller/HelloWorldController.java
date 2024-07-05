package com.cdac.training.springweb.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/bangalore")
	public String showHello()
	{
		return "HelloWorld";  //returns view name
	}
	
	@RequestMapping("/testdemo")
	public String showHello1()
	{
		return "test";  //returns view test.jsp
	}

	/* Work Flow of Spring MVC Application
	 * 
	 *   Client --> Request(index.jsp) --> FrontController(Web.xml) 
	 *       -->User Controller(HelloWorldController) ---> response(helloWorld.jsp) 
	 * 
	 */

}
