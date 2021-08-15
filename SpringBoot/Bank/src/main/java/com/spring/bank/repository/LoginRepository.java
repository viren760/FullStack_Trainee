package com.spring.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bank.entities.Login;

public interface LoginRepository extends JpaRepository<Login, Integer> {


	
}
