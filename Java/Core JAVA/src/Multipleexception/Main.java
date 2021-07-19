package Multipleexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;

public class Main {

	public static void main(String[] args) {
		
		MultipleExcep me = new MultipleExcep();

		// *** Try and Catch 
		
//		try {
//			me.start();
//		} catch (IOException e) {
//			System.out.println("Its an IoException");
//		} catch (ParseException e) {
//		System.out.println("Incorrect Format !");
//		}

		
		
		// *** Try with Multiple catch 
		
//		try {
//			me.start();
//		} catch (IOException | ParseException e) {
//			// TODO Auto-generated catch block
//			System.out.println("Incorrect Format !");
//		}
		
		
		// *** Try and catch 
		
		try {
			me.stop();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not Found !!");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("Parent of File not found !! if they found me first soo they will not go to the file not founf which is an incorrect format and one catch is left");
		}
		
		
		// *** Try with multiple catch
		
		try {
			me.stop();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("In this multiplecatch there is not an file not found this is due to because its and child of IoException");
		}

	}

}
