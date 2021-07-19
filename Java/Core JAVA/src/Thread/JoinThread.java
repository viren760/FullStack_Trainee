package Thread;

class Medical extends Thread{
	
	public void run() {
	
			System.out.println("Medical test start");
			
			try{
				Thread.sleep(1000);	
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("Medical test completed");
	}
}

class Test extends Thread{
	public void run() {
	System.out.println("=================================");
		try{
			Thread.sleep(2000);	
		}catch(Exception e) {
			System.out.println(e);
		}
		
			System.out.println("Test start");
			
			try{
				Thread.sleep(1000);	
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("Test completed");
	
	}		
}

class Officer extends Thread{
	public void run() {
		System.out.println("=================================");		
		try{
			Thread.sleep(2000);	
		}catch(Exception e) {
			System.out.println(e);
		}	
		
			System.out.println("officer test start");
			
			try{
				Thread.sleep(1000);	
			}catch(Exception e) {
				System.out.println(e);
			}
			
			System.out.println("Officer test completed");
	}	
}


public class JoinThread {

	public static void main(String[] args)throws InterruptedException {
        Medical m = new Medical();
        m.start();
        m.join();
        
        Test t = new Test();
        t.start();
        t.join();
        
        Officer o = new Officer();
        o.start();

	}

}
