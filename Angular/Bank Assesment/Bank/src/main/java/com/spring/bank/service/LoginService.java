package com.spring.bank.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.spring.bank.dto.LoginRequest;
import com.spring.bank.dto.Response;
import com.spring.bank.entities.User;
import com.spring.bank.exception.CustomException;
import com.spring.bank.repository.UserRepository;

@Service
public class LoginService {

	@Autowired
	private UserRepository userRepository;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public List<User> getAllDetails() {
		List<User> findAll = this.userRepository.findAll();
		return findAll;

	}

	public User createNewLogin(User login) {
		log.info("CreateNewLogin" + " " + login);

		Optional<User> findByEmail = userRepository.findByEmail(login.getEmail());
		if (findByEmail.isPresent()) {
			throw new CustomException("email already exists", HttpStatus.BAD_REQUEST);
		}

		return this.userRepository.save(login);

	}

	public Response<String> login(LoginRequest login) {
		Optional<User> u = userRepository.findByEmail(login.getEmail());
		if (u.isPresent()) {
			if (!u.get().getPassword().equals(login.getPassword())) {
				return new Response<String>("email or password incorrect", HttpStatus.BAD_REQUEST.value());
			}
		} else {

			return new Response<String>("email or password incorrect", HttpStatus.BAD_REQUEST.value());
		}
		return new Response<String>("login success", HttpStatus.OK.value());

	}

}
