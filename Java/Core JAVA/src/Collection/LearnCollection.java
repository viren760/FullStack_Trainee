package Collection;

import java.util.ArrayList;
import java.util.Collections;

public class LearnCollection {

	public static void main(String[] args) {
		ArrayList<Integer> li = new ArrayList<>();
          
		li.add(31);
		li.add(20);
		li.add(20);
		li.add(36);
		li.add(49);
		li.add(50);
		li.add(50);
		li.add(16);
		
		System.out.println("Minimum Number : "+Collections.min(li));
		System.out.println("Maximum Number : "+Collections.max(li));
		
		Collections.sort(li);
		
		System.out.println("Sorted Array : "+li);
		System.out.println("Frequency of 50 is : "+Collections.frequency(li, 50));
	}

}
