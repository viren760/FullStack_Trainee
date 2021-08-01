package com.spring.bank.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "bankDetails")
public class Banks {

	@Id
	private String bankName;
	private String loanName;
	private int bankInterest;

	public Banks(String bankName, String loanName, int bankInterest) {
		super();
		this.bankName = bankName;
		this.loanName = loanName;
		this.bankInterest = bankInterest;
	}

	public Banks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public String getLoanName() {
		return loanName;
	}

	public void setLoanName(String loanName) {
		this.loanName = loanName;
	}

	public int getBankInterest() {
		return bankInterest;
	}

	public void setBankInterest(int bankInterest) {
		this.bankInterest = bankInterest;
	}

	@Override
	public String toString() {
		return "Banks [bankName=" + bankName + ", loanName=" + loanName + ", bankInterest=" + bankInterest + "]";
	}

}
