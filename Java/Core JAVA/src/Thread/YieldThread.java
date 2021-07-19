package Thread;

public class YieldThread extends Thread {

	public void run() {
		Thread.yield();
		for(int i=1; i<=5; i++) {
			
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
	}
	
	public static void main(String[] args) {

		YieldThread y = new YieldThread();
		y.start();
		
		for(int i=1; i<=5; i++) {
		
			System.out.println(Thread.currentThread().getName()+" : "+i);
		}
		
	}

}
