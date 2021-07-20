package com.Banking;

import java.util.List;
//import com.google.gson.Gson;

public class BankService {

	public void getAllBanks() {
		Banks.FetchAllBanks();
//		Gson gson = new Gson();
//		String jsonString = gson.toJson(Banks.FetchAllBanks());
		System.out.println(	Banks.FetchAllBanks());

	}

	public Bank getBankDetails(String bankName) throws NotFoundException {

		try {

			if (bankName == null) {
				throw new NotFoundException("Empty value");
			}

		} catch (NotFoundException e) {

			System.out.println("Empty name please fill the bank name ....");

		}

		List<Bank> ban = Banks.FetchAllBanks();

		for (Bank b : ban) {

			if (b.getBankName().equalsIgnoreCase(bankName)) {
				return b;
			}
		}
		return null;

	}

}