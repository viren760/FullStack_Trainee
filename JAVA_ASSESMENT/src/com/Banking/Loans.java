package com.Banking;

public class Loans {
	private String LoanName;
	private int Interest;

	public String getLoanName() {
		return LoanName;
	}

	public void setLoanName(String loanName) {
		LoanName = loanName;
	}

	public int getInterest() {
		return Interest;
	}

	public void setInterest(int interest) {
		Interest = interest;
	}

	public Loans(String loanName, int interest) {
		super();
		LoanName = loanName;
		Interest = interest;
	}

	public Loans() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Loans [LoanName=" + LoanName + ", Interest=" + Interest + "]";
	}

}