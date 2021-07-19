
public class Arrays {

	public static void main(String[] args) {
	
// first way to declare array ...
		
		int[] number = new int [5];
		number[0]= 1;
		number[1]=2;
		number[2]=3;
		number[3]=4;
		number[4]=5;
		
		System.out.println("====Array====");
		 
		for(int i=0; i<number.length; i++) {
			System.out.println(number[i]);
		}
	
	
// second way to declare array ...
	
	int [] array = {10,20,30,40,50,60,70,80,90,100};
	
     System.out.println("=========Short hand Array Declare ========");
     for(int i=0; i<array.length; i++) {
    	 System.out.println(array[i]);
     }
     
     
	}
}
