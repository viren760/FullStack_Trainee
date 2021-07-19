package Collection;

import java.util.HashSet;
import java.util.Set;

public class LearnHashset {

	public static void main(String[] args) {
		Set <Integer> si = new HashSet<>();
		
		si.add(12);
		si.add(21);
		si.add(12);
		si.add(21);
		si.add(112);
		si.add(1244);
		si.add(123);
		
		// values are priniting depends on his hashcode given by the jvm ....
		
		System.out.println("All values are : "+si);
		System.out.println(si.contains(12));
		System.out.println(si.isEmpty());
		System.out.println(si.remove(21));
		System.out.println(si);
		si.clear();
		System.out.println(si.isEmpty());

	}

}
