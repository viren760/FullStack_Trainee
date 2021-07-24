package com.Banking;

import java.util.List;

public class BankController {

	public static void main(String[] args) throws NotFoundException {

		BankService bankservice = new BankService();
		System.out.println("All Bank Details :");
		String fetchAllBanks = bankservice.getAllBank();
		System.out.println(fetchAllBanks);

		try {
			System.out.println("Fetching Bank Details ...");
			Bank bankByName = bankservice.getBankByName("PNB");
			System.out.println(bankByName);
			System.out.println();
		} catch (Exception e) {
			System.out.println("Bank Not Found ( 404 )");
		}

		try {
			System.out.println("Apply for Loan :");
			String applyLoan = bankservice.applyLoan("SBI", "Personal Loans");
			System.out.println(applyLoan);
		} catch (Exception e) {
			System.out.println("{\n Status : failed \n }");
		}

	}

}
