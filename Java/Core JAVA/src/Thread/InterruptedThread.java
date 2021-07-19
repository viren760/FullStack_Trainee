package Thread;

public class InterruptedThread extends Thread {


	public void run() {
	
		try {
		for (int i =1; i<=5; i++) {
			
				System.out.println("Thread "+i);
				Thread.sleep(1000);
			}
		}catch(Exception e) {
				System.out.println("Interrupted Exception - "+e);
			}
			
		}
	
	
	
	public static void main(String[] args) {
		InterruptedThread i = new InterruptedThread();
		i.start();
		i.interrupt();

	}

}
