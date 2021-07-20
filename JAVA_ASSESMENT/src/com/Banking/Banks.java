package com.Banking;

import java.util.ArrayList;
import java.util.List;

public class Banks {
	private List<Bank> banks;

	public Banks(List<Bank> banks) {
		super();
		this.banks = banks;
	}

	public Banks() {
		super();
		// TODO Auto-generated constructor stub
	}

	public List<Bank> getBanks() {
		return banks;
	}

	public void setBanks(List<Bank> banks) {
		this.banks = banks;
	}

	@Override
	public String toString() {
		return "Banks [banks=" + banks + "]";
	}

	public static List<Bank> FetchAllBanks() {
		List<Bank> banks = new ArrayList<>();

		banks.add(new Bank("SBI", List.of(new Loans("Personal Loans", 5), new Loans("Financial Loans", 12),
				new Loans("Two-Wheller Loans", 9))));
		banks.add(new Bank("HDFC", List.of(new Loans("Personal Loans", 10), new Loans("Home Loans", 15),
				new Loans("Two-Wheller Loans", 12), new Loans("Educational Loans", 16))));
		banks.add(new Bank("KOTAK",
				List.of(new Loans("Personal Loans", 7), new Loans("Financial Loans", 10), new Loans("Car Loans", 9))));
		banks.add(new Bank("PNB", List.of(new Loans("Personal Loans", 6), new Loans("Educational Loans", 11),
				new Loans("Two-Wheller Loans", 7), new Loans("Financial Loans", 10))));

		return banks;
	}
}
