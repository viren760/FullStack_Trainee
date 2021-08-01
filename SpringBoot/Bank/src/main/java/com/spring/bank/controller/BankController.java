package com.spring.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bank.entities.Banks;
import com.spring.bank.service.BankService;

@RestController
public class BankController {

	@Autowired
	private BankService bankservice;

	@GetMapping("/banks")
	public List<Banks> GetAllBanks() {
		List<Banks> allbanks = bankservice.getAllbanks();
		return allbanks;

	}

	@GetMapping("/banks/{bankName}")
	public Banks findBankByName(@PathVariable("bankName") String bank_name) {
		Banks findByBankName = bankservice.findByBankName(bank_name);
		return findByBankName;

	}

	@GetMapping("/banks/{bankName}/{loanName}")
	public Banks applyForLoan(@PathVariable("bankName") String bank_name, @PathVariable("loanName") String loan_name) {
		Banks applyForLoans = bankservice.applyForLoans(bank_name, loan_name);
		return applyForLoans;

	}

	@PostMapping("/banks")
	public Banks CreateNewBank(@RequestBody Banks banks) {
		Banks createNewBank = bankservice.CreateNewBank(banks);
		return createNewBank;

	}

	@DeleteMapping("/banks/{bankName}")
	public void DeleteBank(@PathVariable("bankName") String bankName) {
		bankservice.DeleteBanks(bankName);
	}

	@PutMapping("/banks/{bankName}")
	public Banks UpdateBanks(@PathVariable("bankName") String bankName, @RequestBody Banks b) {
		Banks updateBanks = bankservice.UpdateBanks(bankName, b);
		return updateBanks;

	}
}
