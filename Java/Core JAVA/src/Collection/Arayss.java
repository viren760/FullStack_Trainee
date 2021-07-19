package Collection;

import java.util.Arrays;

public class Arayss {

	public static void main(String[] args) {
		int [] numbers= {10,20,90,50,29,190};
		
		
		Arrays.sort(numbers);
		
		for(int i :numbers) {
			System.out.println(i);
		}
		
		int index= Arrays.binarySearch(numbers, 90);
		
		System.out.println("============================");
		
		System.out.println("Index of 90 is : "+index);

	}

}
