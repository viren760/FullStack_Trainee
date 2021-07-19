import java.util.TreeSet;

public class Loans_Details {

	static void All_Loan_Details(TreeSet<Object> loan_names) {
	
		
	}
	
	
	
	public static void main(String[] args) {
		
		Loans_Details loans= new Loans_Details();
		
		TreeSet<Object> loan_names = new TreeSet<>();
		
		loan_names.add("Personal Loans");
		loan_names.add("Home Loans");
		loan_names.add("Financial Loans");
		loan_names.add("Educational Loans");
		loan_names.add("Two-Wheller Loans");
		
		All_Loan_Details(loan_names);

	}

}
