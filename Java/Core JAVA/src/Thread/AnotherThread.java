package Thread;

public class AnotherThread extends Thread {

	public void run() {
	
		for (int i =1; i<=10; i++) {
			
			System.out.println("Value of "+i+" Thread is : "+i);
			
			try {
			
				Thread.sleep(3000);
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
			
		}

	}
}