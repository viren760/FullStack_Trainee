
public class If_else {

	public static void main(String[] args) {
		
		int number= 25;
		if(number <25) {
			System.out.println("It is smaller ");	
		}else if(number>25) {
			System.out.println("It is greater");
		}else {
			System.out.println("None of the above");
		}
System.out.println("====================================================");
		int amount=0;
		while (true) {
			System.out.println("In the Loop");
			
			if(amount==6) {
				break;
			}
			
			amount += 1;
			System.out.println("Out of the loop");
		}
	}

}
