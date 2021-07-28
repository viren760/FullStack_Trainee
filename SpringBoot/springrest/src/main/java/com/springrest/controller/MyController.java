package com.springrest.controller;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@SpringBootApplication
@RestController
public class MyController {

	@GetMapping("/home")
	public String home(){
		return "welcome to home page !!";
	}
	
	@RequestMapping("/contact")
	public String Contact() {
		return "Welcome to contact page !!";
	}
	
}
