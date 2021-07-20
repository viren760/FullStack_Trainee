package com.Banking;

import java.util.List;

public class Bank {
	private String bankName;
	private List<Loans> loans;

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public List<Loans> getLoans() {
		return loans;
	}

	public void setLoans(List<Loans> loans) {
		this.loans = loans;
	}

	public Bank(String bankName, List<Loans> loans) {
		super();
		this.bankName = bankName;
		this.loans = loans;
	}

	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Bank [bankName=" + bankName + ", loans=" + loans + "]";
	}

}