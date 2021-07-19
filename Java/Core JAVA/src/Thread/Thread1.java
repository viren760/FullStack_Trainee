package Thread;

public class Thread1 extends Thread {

	public void run() {
	
		System.out.println("My thread is running");
		for (int i =10; i>=1; i--) {
		
			System.out.println("Value of "+i+" Thread is : "+i);
			
			try {
			
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}
	
	
	public static void main(String[] args) {

		Thread1 t = new Thread1();
		AnotherThread at = new AnotherThread();
		t.start();
		at.start();
	

	}

}
