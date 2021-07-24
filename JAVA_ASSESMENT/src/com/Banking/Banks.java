package com.Banking;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Banks {
	private List<Bank> banks = new ArrayList();

	public Banks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Bank> getBanks() {
		return banks;
	}

	{
		this.banks.add(new Bank("SBI", List.of(new Loans("Personal Loans", 5), new Loans("Financial Loans", 12),
				new Loans("Two-Wheller Loans", 9))));
		this.banks.add(new Bank("HDFC", List.of(new Loans("Personal Loans", 10), new Loans("Home Loans", 15),
				new Loans("Two-Wheller Loans", 12), new Loans("Educational Loans", 16))));
		this.banks.add(new Bank("KOTAK",
				List.of(new Loans("Personal Loans", 7), new Loans("Financial Loans", 10), new Loans("Car Loans", 9))));
		this.banks.add((new Bank("PNB", List.of(new Loans("Personal Loans", 6), new Loans("Educational Loans", 11),
				new Loans("Two-Wheller Loans", 7), new Loans("Financial Loans", 10)))));
	}

	public String fetchAllBanks() {

		String result = "";
		for (Bank bank : this.banks) {
			String loans = "";
			for (Loans loan : bank.getLoans()) {
				loans += loan.getLoanName() + ", ";
			}
			result += "[bankName: '" + bank.getBankName() + "',loans: " + loans.substring(0, loans.length() - 2)
					+ "]\n";

		}

		return result;
	}

}
