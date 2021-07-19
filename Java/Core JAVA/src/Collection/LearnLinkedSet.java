package Collection;

import java.util.LinkedHashSet;

public class LearnLinkedSet {

	public static void main(String[] args) {
	  LinkedHashSet <Integer> li = new LinkedHashSet<>();
	  li.add(12);
		li.add(21);
		li.add(12);
		li.add(21);
		li.add(112);
		li.add(1244);
		li.add(123);
		
		// values are priniting same as we add the element and remove duplicacy ....
		
		System.out.println("All values are : "+li);
		System.out.println(li.contains(12));
		System.out.println(li.isEmpty());
		System.out.println(li.remove(21));
		System.out.println(li);
		li.clear();
		System.out.println(li.isEmpty());

	}

}
