package Bank_Project;

public class Loans {
	private String Loan_type;
	private int interests;
	
	public Loans(String loan_type, int interests) {
		super();
		Loan_type = loan_type;
		this.interests = interests;
	}

	public Loans() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getLoan_type() {
		return Loan_type;
	}

	public void setLoan_type(String loan_type) {
		Loan_type = loan_type;
	}

	public int getInterests() {
		return interests;
	}

	public void setInterests(int interests) {
		this.interests = interests;
	}

	@Override
	public String toString() {
		return "Loans [Loan_type=" + Loan_type + ", interests=" + interests + "]";
	}
	
	

}
