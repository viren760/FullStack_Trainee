package Collection;

import java.util.Stack;

public class LearStack {

	public static void main(String[] args) {
		Stack <String> animal= new Stack<>();
		
		animal.add("Lion");
		animal.add("Hourse");
		animal.add("Tiger");
		animal.add("Monkey");
		animal.add("Giraffe");
		
		System.out.println(animal);
		
		System.out.println(animal.peek());
		
		animal.pop();
		System.out.println("After pop the animal : "+animal);
		
	}

}
