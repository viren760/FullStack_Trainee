package Collection;

import java.util.ArrayDeque;

public class LearnArrayDeque {

	public static void main(String[] args) {
		ArrayDeque<Integer> aq = new ArrayDeque<>();
		
		aq.offer(12);
		aq.offerFirst(30);  // it means insert into first....
		aq.offerLast(90);   // it means insert into last ....
		aq.offer(34);       // it also means insert into last so it will override offerlast .....
		aq.offer(123);
		System.out.println(aq);
		System.out.println("+++++++ Peek +++++++++++");
	  System.out.println(aq.peek());
	  System.out.println(aq.peekFirst());
	  System.out.println(aq.peekLast());
	  System.out.println("++++++++++ Poll ++++++++++");
	  System.out.println(aq.poll());
	  System.out.println(aq.pollFirst());
	  System.out.println(aq.pollLast());
	  System.out.println("New queue : "+aq);
	  
	  
	}

}
