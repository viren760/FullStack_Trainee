import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader {

	public static void main(String[] args) throws FileNotFoundException {

      String myfile ="C:\\Users\\Virender Negi\\Desktop\\VIRENDER\\bio.txt";
      
      File file = new File(myfile);

      Scanner sc = new Scanner(file);
    
      // this will read the integer first ...
      int txt = sc.nextInt();
      
      System.out.println("My roll no is :"+txt);
      
     // this will read the string line by line 
    while(sc.hasNextLine()) {
    	String line = sc.nextLine();
    	System.out.println(line);
    }
      sc.close();
      
	}

}
