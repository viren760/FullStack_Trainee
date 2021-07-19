import java.util.Scanner;
public class Scanner_input {

	public static void main(String[] args) {
	     Scanner sc = new Scanner (System.in);
	     
	     System.out.println("What is your name :");
	    
	     // for String
	     String input = sc.nextLine();
	     System.out.println("my Name is : "+input);
	     
	     // for Integer
	    System.out.println("what is your age :");
	    int age = sc.nextInt();
	    System.out.println("My Age is : "+age);
	    
	    // for double value 
	    System.out.println("What is your Salary :");
	    double salary = sc.nextDouble();
	    System.out.println("My salary is :"+salary);
	     
	}
}
