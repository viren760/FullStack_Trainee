import java.util.Scanner;

public class ReverseName {  
    static void reverseString(String input) {  
   
        char[] inputArray = input.toCharArray();  
        char[] result = new char[inputArray.length];  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] == ' ') {  
                result[i] = ' ';  
				System.out.println(result[i]);
            }  
        }  
   
        int j = result.length - 1;  
   
        for (int i = 0; i < inputArray.length; i++) {  
            if (inputArray[i] != ' ') {  
                if (result[j] == ' ') {  
                    j--;  
                }  
                result[j] = inputArray[i];  
                j--;  
            }  
        }  
		System.out.println("My name is : "+input);  
        System.out.println("Reverse of My name is : "+ String.valueOf(result));  
    }  
   
    public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
	  System.out.println("Enter your name :");
      String input = sc.nextLine();	 
       reverseString(input);  	  
          
    }  
}  