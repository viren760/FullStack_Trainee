package Thread;

public class Interrupted2Thread extends Thread {


	public void run() {
	    
		try {
			 System.out.println(Thread.interrupted());  // True -> False.
		     System.out.println(Thread.currentThread().isInterrupted());   // remains True doesnot change ...
		for (int i =1; i<=5; i++) {
			
				System.out.println("Thread "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
				System.out.println("Interrupted Exception - "+e);
			}
			
		}
	
	
	
	public static void main(String[] args) {
		Interrupted2Thread i = new Interrupted2Thread();
		i.start();
		i.interrupt();

	}

}
