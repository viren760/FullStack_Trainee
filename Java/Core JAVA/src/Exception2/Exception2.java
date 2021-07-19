package Exception2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception2 {

	public static void main(String[] args) {
		
		File file = new File("example.txt");
		
		try {
			Scanner sc = new Scanner(file);
			System.out.println("under the exception.... ");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("Error file name is : "+file);
		}
		System.out.println("Exception handle Succesfully.....");
		System.out.println("======================================");
		System.out.println("out of the Exception handling ...");

	}

}
