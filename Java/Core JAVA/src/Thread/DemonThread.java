package Thread;





public class DemonThread extends Thread{

	public void run() {
		System.out.println(Thread.currentThread().isDaemon());
		if(Thread.currentThread().isDaemon()) {
			System.out.println("Daemon Thread");		
		}else {
			System.out.println("Child Thread");
		}
	
	}
	
	public static void main(String[] args) {
		
        System.out.println("Main Thread");
		
		DemonThread d = new DemonThread();
		d.setDaemon(true);
		d.start();
		
		
	}

}
