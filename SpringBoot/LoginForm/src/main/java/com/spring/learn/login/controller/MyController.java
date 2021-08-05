package com.spring.learn.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MyController {

	@GetMapping("/login")
	public String loginForm() {
		return "form";
		
	}
	
	
}
