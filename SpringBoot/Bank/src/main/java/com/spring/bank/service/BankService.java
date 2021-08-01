package com.spring.bank.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.bank.entities.Banks;
import com.spring.bank.exception.CustomException;
import com.spring.bank.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankRepository bankrepository;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public List<Banks> getAllbanks() {
		log.info("getAllbanks");
		Iterable<Banks> findAll = this.bankrepository.findAll();
		return (List) findAll;

	}

	public Banks findByBankName(String bankName) {
		log.info("findByBankName" + " " + bankName);
		return this.bankrepository.findByBankName(bankName)
				.orElseThrow(() -> new CustomException("not found", HttpStatus.NOT_FOUND));

	}

	public Banks applyForLoans(String bankName, String loanName) {
		log.info("applyForLoans" + " " + bankName + " " + loanName);
		Banks applyForloans = this.bankrepository.findByBankNameAndLoanName(bankName, loanName)
				.orElseThrow(() -> new CustomException("Not Found", HttpStatus.NOT_FOUND));
		return applyForloans;
	}

	public Banks CreateNewBank(Banks banks) {
		log.info("CreateNewBank" + " " + banks);
		Banks save = this.bankrepository.save(banks);
		return save;

	}

	public void DeleteBanks(String bankName) {
		log.info("DeleteBanks" + " " + bankName);
		this.bankrepository.deleteById(bankName);
	}

	public Banks UpdateBanks(String bankName, Banks b) {
		log.info("UpdateBanks" + " " + bankName, b);
		Banks banks = bankrepository.findByBankName(bankName)
				.orElseThrow(() -> new CustomException("not found", HttpStatus.NOT_FOUND));
		banks.setBankInterest(b.getBankInterest());
		banks.setLoanName(b.getLoanName());
		return this.bankrepository.save(banks);
	}

}
