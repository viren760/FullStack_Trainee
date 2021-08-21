package com.spring.bank.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bank.dto.LoginRequest;
import com.spring.bank.dto.Response;
import com.spring.bank.entities.User;
import com.spring.bank.service.LoginService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/login")
public class AuthController {

	@Autowired
	private LoginService loginService;

	@GetMapping
	public List<User> getAllDetails() {
		List<User> allDetails = this.loginService.getAllDetails();
		return allDetails;

	}

	@PostMapping("/signup")
	public ResponseEntity<User> createNewLogin(@RequestBody User user) {

		User createNewLogin = loginService.createNewLogin(user);
		return ResponseEntity.of(Optional.of(createNewLogin));
	}

	@PostMapping("/login")
	public Response<User> login(@RequestBody LoginRequest login){
		return loginService.login(login);
	}
	
}
