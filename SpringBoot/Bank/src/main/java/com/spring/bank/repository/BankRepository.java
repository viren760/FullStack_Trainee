package com.spring.bank.repository;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.spring.bank.entities.Banks;

@Repository
public interface BankRepository extends CrudRepository<Banks, String> {
	
	public Optional<Banks> findByBankName(String bankName);
	
	public Optional<Banks> findByBankNameAndLoanName(String bankName , String LoanName);


}
