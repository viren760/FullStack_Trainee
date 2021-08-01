package com.spring.learn.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.learn.login.entities.Form;

@Controller
public class MyController {

	@GetMapping("/login")
	public String loginForm() {
		return "form";
		
	}
	
	@GetMapping("/")
	public String home() {
		return "form";
	}
}
