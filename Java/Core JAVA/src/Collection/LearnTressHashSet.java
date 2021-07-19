package Collection;

import java.util.TreeSet;

public class LearnTressHashSet {

	public static void main(String[] args) {
	TreeSet <Integer> ti = new TreeSet<>();
	
	 ti.add(12);
		ti.add(1244);
		ti.add(21);
		ti.add(12);
		ti.add(21);
		ti.add(112);
		ti.add(123);
		
		// values are priniting in ascending order and duplicacy is also not there ....
		
		System.out.println("All values are : "+ti);
		System.out.println(ti.contains(12));
		System.out.println(ti.isEmpty());
		System.out.println(ti.remove(21));
		System.out.println(ti);
		ti.clear();
		System.out.println(ti.isEmpty());

	}

}
