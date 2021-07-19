package Thread;

public class SleepThread extends Thread {

	public void run() {
		for (int i =1; i<=5; i++) {
		
			try {
				Thread.sleep(1000);
				System.out.println("Thread "+i);	
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
	
	public static void main(String[] args) {
		SleepThread s = new SleepThread();
		s.start();

	}

}
