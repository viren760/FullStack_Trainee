package Exception1;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exception1 {
// here we throws an Exception .... Exception Shuld be thrown on the console
	public static void main(String[] args) throws FileNotFoundException {


		File file = new File("example.txt");
		
		Scanner sc = new Scanner(file);
		System.out.println("Exception handle Succesfully ....");
	}

}
