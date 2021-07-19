import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.println("Enter the Instruction :");
	   
	   String Text = sc.nextLine();
	   
	   switch(Text) {
	   case"run":
		   System.out.println("===============Programm is running===============");
		   break;
	   case"stop":
		   System.out.println("===============Programm is STOP==============");
		   break;
		default:
			System.out.println("================Instruction not Recognized===============");
	   }
	   

	}

}
