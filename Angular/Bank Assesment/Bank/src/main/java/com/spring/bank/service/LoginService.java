package com.spring.bank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.bank.entities.Login;
import com.spring.bank.repository.LoginRepository;

@Service
public class LoginService {

	@Autowired
	private LoginRepository loginRepository;
	
	private final Logger log = LoggerFactory.getLogger(this.getClass());

	
	public List<Login> getAllDetails() {
		List<Login> findAll = this.loginRepository.findAll();
		return  findAll;
		
	}
	
	
	public Login createNewLogin(Login login) {
		log.info("CreateNewLogin" + " " + login);
		
		return this.loginRepository.save(login);
		
	}
	
}
