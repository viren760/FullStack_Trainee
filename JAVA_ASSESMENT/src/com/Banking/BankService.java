package com.Banking;

import java.util.List;

public class BankService {

	Banks b = new Banks();

	public String getAllBank() {
		return b.fetchAllBanks();
	}

	public Bank getBankByName(String bankName) {
		Bank bank = b.getBanks().stream().filter(banks -> banks.getBankName().equals(bankName)).findAny().orElse(null);

		if (bank == null) {
			throw new NotFoundException("bank not found", 404);
		}
		return bank;
	}

	public String applyLoan(String bankname, String loanName) {
		Bank bank = getBankByName(bankname);
		Loans loans = bank.getLoans().stream().filter(loan -> loan.getLoanName().equals(loanName)).findAny()
				.orElse(null);
		if (loans == null) {
			throw new NotFoundException("loan type not found", 404);
		}
		return "{\n" + "status: 'Success',\n" + "bankName: '" + bankname + "',\n" + "interestRate: '"
				+ loans.getInterest() + "'\n" + "loanName: '" + loanName + "'\n" + "}";

	}

}