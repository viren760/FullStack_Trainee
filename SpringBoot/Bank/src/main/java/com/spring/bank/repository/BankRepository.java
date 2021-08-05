package com.spring.bank.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spring.bank.entities.Banks;

@Repository
public interface BankRepository extends JpaRepository<Banks, Integer> {

	public Optional<Banks> findByBankId(int bankId);

}
