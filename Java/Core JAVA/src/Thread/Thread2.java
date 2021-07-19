package Thread;

public class Thread2 implements Runnable {
	
	public void run() {
		System.out.println("My thread is running");
		for (int i =1; i<=10; i++) {
			System.out.println("Value of "+i+" Thread is : "+i);
			
			try {
			
				Thread.sleep(1000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
		}
	}

	public static void main(String[] args) {
	
		Thread2 t = new Thread2();
		Thread th = new Thread(t);
		
		th.start();
		

	}

}
