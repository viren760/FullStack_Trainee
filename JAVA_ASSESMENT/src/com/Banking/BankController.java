package com.Banking;

//import com.google.gson.Gson;

public class BankController {

	public static void main(String[] args) throws NotFoundException {
		BankService bankservice = new BankService();
		System.out.println("============================= Showing All Banks =============================");
		System.out.println();
		bankservice.getAllBanks();
		System.out.println();
		System.out.println("============================== Bank Details===============================");
		System.out.println();
		bankservice.getBankDetails("HDFC");
//		Gson gson = new Gson();
//		String jsonString = gson.toJson(bankservice.getBankDetails("HDFC"));
		System.out.println(	bankservice.getBankDetails("HDFC"));
	}

}
