package Collection;

import java.util.LinkedList;
import java.util.Queue;

public class LearnQueue {

	public static void main(String[] args) {
       Queue<Integer> value = new LinkedList<>();
       
       value.offer(1);
       value.offer(2);
       value.offer(3);
       value.offer(4);
       value.offer(5);
       value.offer(6);
       
       System.out.println("Queue : "+value );
       System.out.println("Queue : "+value.poll() );
       System.out.println("New Queue : "+value);
       System.out.println(value.peek());
	}

}
