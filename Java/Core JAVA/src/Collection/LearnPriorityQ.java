package Collection;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LearnPriorityQ {

	public static void main(String[] args) {
	// IT always give priority from smaller to larger ...
	PriorityQueue <Integer> pq = new PriorityQueue<>();
	
	pq.offer(12);
	pq.offer(78);
	pq.offer(10);
	pq.offer(2);
	pq.offer(100);
	
	System.out.println("All value : "+pq);
	
	System.out.println("=====================================");


	// Comparator.reverseOrder give priority to higher to lower ....
	PriorityQueue <Integer> pqu = new PriorityQueue<>(Comparator.reverseOrder());
	
	pqu.offer(12);
	pqu.offer(78);
	pqu.offer(10);
	pqu.offer(2);
	pqu.offer(100);
	
	System.out.println("All value : "+pqu);



	}

}
