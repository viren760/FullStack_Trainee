package com.spring.devtools.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MyController {

	@RequestMapping("/add")
	@ResponseBody
	public String addition() {
		int a=100;
		int b=300;
		
		return "the addition of a and b are : "+(a+b);
	}
	
}
