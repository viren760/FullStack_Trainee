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

import com.spring.bank.entities.Login;
import com.spring.bank.service.LoginService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/login")
public class LoginController {

	@Autowired
	private LoginService loginService;

	@GetMapping
	public List<Login> getAllDetails() {
		List<Login> allDetails = this.loginService.getAllDetails();
		return allDetails;

	}

	@PostMapping()
	public ResponseEntity<Login> createNewLogin(@RequestBody Login login) {

		Login createNewLogin = loginService.createNewLogin(login);
		return ResponseEntity.of(Optional.of(createNewLogin));
	}

}
