import java.util.TreeSet;

public class Bank {
	
   static String input = "SBI";


	public static void main(String[] args)throws PageNotFoundExp {
		
		Bank bank = new Bank();

		TreeSet<String> bank_names = new TreeSet<String>();
		bank_names.add("SBI");
		bank_names.add("KOTAK");
		bank_names.add("PNB");
		bank_names.add("HDFC");
		
//		try {
//		
//			if(input.equals(bank_names)) {
//			      System.out.println(input);
//				}else {
//					throw new PageNotFoundExp("Page Not Found");
//				}
//			
//		}catch(PageNotFoundExp e) {
//			System.out.println("404 not found ...");
//		}
		
		
	}

}
