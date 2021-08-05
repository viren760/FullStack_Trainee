package com.spring.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.bank.entities.Loans;

public interface loansRepository extends JpaRepository<Loans, Integer> {

}
