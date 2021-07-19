package Thread;

public class ThreadOp {

	public static void main(String[] args) {
		
		System.out.println("Programm Started ....");
		int x=12+54;
		System.out.println("Value of x is : "+x);
	
		Thread t = Thread.currentThread();
		String tname = t.getName();
		System.out.println("current running thread is : "+tname);
		System.out.println("current running thread id : "+t.getId());
		 t.setName("My thread");
		 
		 String tgname = t.getName();
		 System.out.println("new thread name is : "+tgname);
		 
		try {
			Thread.sleep(5000);	
		}catch(Exception e) {
			
		}
		 
			System.out.println("Programm ended ....");

	}

}
