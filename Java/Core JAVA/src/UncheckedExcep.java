
public class UncheckedExcep {

	public static void main(String[] args) {

     
		int value= 11;
		
		// It will not shows an Exception in compile time but throws an Exception in Runtime.... 
		// AirthmeticException number/0
     	value = value/0;
		
		
		
		 String str=null;
		 // it will shows an NullPointerException ...
     	System.out.println(str.length());
		
		
		int[] arr = { 1,2,3,4};
	// it will show ArrayIndexOutOfBoundsException	
		System.out.println(arr[4]);
	}

}
