package com.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/say")
public class HelloWorldController {
	
	@RequestMapping("hello")
	public String helloWorld(){
		return "helloworld";
	} 
}
