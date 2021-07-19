import java.util.Scanner;
public class Do_while {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int number;
		do {
			System.out.println("Enter 1 to Start :");
			number = sc.nextInt();
		}
		while(number != 1);
			
		System.out.println("Lets Start");
		
	//  The Java do-while loop is used to iterate a part of the program several times.
    //	 If the number of iteration is not fixed and you must have to execute the loop at least once	
		 int i=10;  
		    do{  
		        System.out.println(i);  
		    i++;  
		   }while(i<10);  

	}

}
