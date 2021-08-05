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
import com.spring.bank.repository.loansRepository;
import com.spring.bank.service.BankService;

@RestController
@RequestMapping("/banks")
public class BankController {

	@Value("${user.username}")
	private String username;

	@Value("${user.password}")
	private String password;

	@Autowired
	loansRepository loansRepository;

	@Autowired
	private BankService bankservice;

	@GetMapping("/")
	public ResponseEntity<List<Banks>> GetAllBanks() {
		List<Banks> allbanks = bankservice.getAllbanks();
		if (allbanks.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(allbanks));

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
	public String applyForLoan(@PathVariable("bankId") int bankId, @PathVariable("loanName") String loan_name) {
		return bankservice.applyForLoans(bankId, loan_name);

	}

	@PostMapping("/")
	public ResponseEntity<Banks> CreateNewBank(@RequestBody Banks banks, HttpServletRequest request) {
		this.validateUser(request);
		Banks createNewBank = null;
		try {
			createNewBank = bankservice.CreateNewBank(banks);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}
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
	public ResponseEntity<Void> DeleteBank(@PathVariable("bankId") int bankId) {
		try {
			bankservice.DeleteBanks(bankId);
			return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

	@PutMapping("/{bankId}")
	public ResponseEntity<Banks> UpdateBanks(@RequestBody Banks b, @PathVariable("bankId") int bankId) {
		try {

			Banks updateBanks = bankservice.UpdateBanks(b, bankId);
			return ResponseEntity.ok().body(b);
		} catch (Exception e) {
			e.printStackTrace();
			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
		}

	}

}
