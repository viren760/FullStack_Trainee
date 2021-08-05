package com.spring.bank.controller;

import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.bank.entities.Banks;
import com.spring.bank.exception.CustomException;
import com.spring.bank.service.BankService;

@RestController
@RequestMapping("/banks")
public class BankController {

	@Value("${user.username}")
	private String username;

	@Value("${user.password}")
	private String password;

	@Autowired
	private BankService bankservice;

	@GetMapping
	public ResponseEntity<List<Banks>> getAllBanks() {
		List<Banks> allBanks = bankservice.getAllbanks();
		if (allBanks.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allBanks));

	}

	@GetMapping("/{bankId}")
	public ResponseEntity<Banks> findBankByName(@PathVariable("bankId") int bankId) {
		Banks findByBankName = bankservice.findByBankId(bankId);
		if (findByBankName == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(findByBankName));

	}

	@GetMapping("/{bankId}/{loanName}")
	public String applyForLoan(@PathVariable("bankId") int bankId, @PathVariable("loanName") String loanName) {
		return bankservice.applyForLoans(bankId, loanName);

	}

	@PostMapping
	public ResponseEntity<Banks> createNewBank(@RequestBody Banks banks, HttpServletRequest request) {

		this.validateUser(request);
		Banks createNewBank = bankservice.createNewBank(banks);
		return ResponseEntity.of(Optional.of(createNewBank));
	}

	private void validateUser(HttpServletRequest request) {
		String username = request.getHeader("username").trim();
		String password = request.getHeader("password").trim();

		if (!username.equals(username) || !password.equals(password)) {
			throw new CustomException("invalid credentials", HttpStatus.BAD_REQUEST);
		}
	}

	@DeleteMapping("/{bankId}")
	public ResponseEntity<String> deleteBank(@PathVariable("bankId") int bankId) {
		bankservice.deleteBanks(bankId);
		return ResponseEntity.ok().body("Succesfully deleted ....");

	}

	@PutMapping
	public Banks updateBanks(@RequestBody Banks bank) {
		this.bankservice.updateBanks(bank);
		return bank;
	}

}
