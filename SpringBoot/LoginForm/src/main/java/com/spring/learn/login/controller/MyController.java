package com.spring.learn.login.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.ModelAndView;

import com.spring.learn.login.entities.Form;

@Controller
public class MyController {

	@GetMapping("/login")
	public ModelAndView loginForm(@ModelAttribute Form form) {
		
		ModelAndView mv = new ModelAndView();
		mv.setViewName("form");
		if(form !=null) {
			mv.addObject("form",form);
			
		}else {
			mv.addObject("form",new Form());
			
		}
		
		return mv;
		
	}
	
	
}
