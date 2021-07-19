package Multipleexception;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.ParseException;




public class MultipleExcep {

	public void start() throws IOException, ParseException {
		

		throw new ParseException("Error in line", 14);
		
		
	}
	
	public void stop() throws IOException ,FileNotFoundException {
		
	
	}
}
