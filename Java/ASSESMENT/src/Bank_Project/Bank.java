package Bank_Project;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.TreeSet;

public class Bank {

	private String bank_names;
	private List<Loans> loans;
	

	public Bank(String bank_names, List<Loans> loans) {
		super();
		this.bank_names = bank_names;
		this.loans = loans;
	}


	public Bank() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getBank_names() {
		return bank_names;
	}


	public void setBank_names(String bank_names) {
		this.bank_names = bank_names;
	}


	public List<Loans> getLoans() {
		return loans;
	}


	public void setLoans(List<Loans> loans) {
		this.loans = loans;
	}


	
	
	@Override
	public String toString() {
		return "Bank [bank_names=" + bank_names + ", loans=" + loans + "]";
	}


	public static void main(String[] args)throws InvalidInfo_Exp {

		List <Bank> banks = new  ArrayList<Bank>();
		banks.add(new Bank("SBI",List.of(new Loans("Personal Loans",5),new Loans("Financial Loans",12), new Loans("Two-Wheller Loans",9))));
		banks.add(new Bank("HDFC",List.of(new Loans("Personal Loans",10),new Loans("Home Loans",15), new Loans("Two-Wheller Loans",12),new Loans("Educational Loans",16)))); 	
		banks.add(new Bank("KOTAK",List.of(new Loans("Personal Loans",7),new Loans("Financial Loans",10), new Loans("Car Loans",9))));
		banks.add(new Bank("PNB",List.of(new Loans("Personal Loans",6),new Loans("Educational Loans",11), new Loans("Two-Wheller Loans",7), new Loans("Financial Loans",10))));
		
		
//		System.out.println(banks);
		
		try {

			for(int i=0; i<banks.size(); i++) {
				if("SBI".equals(banks.get(i).getBank_names())) {
					System.out.println(banks.get(i));
				}else {
					throw new InvalidInfo_Exp("Invalid Bank detail");
				}
			}

			
		}catch(InvalidInfo_Exp e) {
			System.out.println("Invalid Bank detail");
		}
		
		
		
		}
		
	}


