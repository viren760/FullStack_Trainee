package com.spring.bank.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.spring.bank.entities.Banks;
import com.spring.bank.entities.Loans;
import com.spring.bank.exception.CustomException;
import com.spring.bank.repository.BankRepository;

@Service
public class BankService {

	@Autowired
	private BankService bankservice;
	
	@Autowired
	private BankRepository bankrepository;

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	public List<Banks> getAllbanks() {
		log.info("getAllbanks");
		Iterable<Banks> findAll = this.bankrepository.findAll();
		return (List<Banks>) findAll;

	}

	public Banks findByBankId(int bankId) {
		log.info("findByBankName" + " " + bankId);
		return this.bankrepository.findByBankId(bankId)
				.orElseThrow(() -> new CustomException("not found", HttpStatus.NOT_FOUND));

	}

	public Banks createNewBank(Banks banks) {
		log.info("CreateNewBank" + " " + banks);
		banks.setBankName(banks.getBankName());
		return this.bankrepository.save(banks);

	}

	public void deleteBanks(int bankId) {
		log.info("Successfully deleted bank id no : " + " " + bankId);
		Banks bank = bankrepository.findByBankId(bankId).orElseThrow(() -> new CustomException("No Bank found", HttpStatus.NOT_FOUND));
		bankrepository.delete(bank);
	}

	public void updateBanks(Banks b) {
		
		Banks bank = bankrepository.findByBankId(b.getBankId()).orElseThrow(() -> new CustomException("No Bank found", HttpStatus.NOT_FOUND));
		bank.setBankName(b.getBankName());

		
		List<Loans> newLoans = b.getLoans();
		List<Loans> oldLoans = bank.getLoans();
		
		for(Loans l: newLoans) {
			
			Loans loan = oldLoans.stream().filter(lon -> lon.getLoanId() == l.getLoanId()).findAny()
					.orElseThrow(() -> new CustomException("No Bank found", HttpStatus.NOT_FOUND));
			
			loan.setLoanName(l.getLoanName());
			loan.setLoanInterest(l.getLoanInterest());
						
		}
		

		bankrepository.save(bank);
		log.info("Successfully Updated Bank details");
		

	}

	public String applyForLoans(int bankId, String loan_name) {
		log.info("Loan apply successfully");
		Banks bank = bankrepository.findById(bankId)
				.orElseThrow(() -> new CustomException("not found", HttpStatus.NOT_FOUND));
		List<Loans> loans = bank.getLoans();
		loans.stream().filter(f -> f.getLoanName().equalsIgnoreCase(loan_name.trim())).findAny()
				.orElseThrow(() -> new CustomException("not found", HttpStatus.NOT_FOUND));
		return "loan apply successfully";

	}

}
