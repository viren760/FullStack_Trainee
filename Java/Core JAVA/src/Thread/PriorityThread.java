package Thread;

public class PriorityThread extends Thread {

	public void run() {
		System.out.println("Child Class inherit his priority from Main Thread");
		System.out.println("Child Thread Priority is : "+Thread.currentThread().getPriority());
	}
	
	public static void main(String[] args) {
		System.out.println("Main Thread  Priority is fixed : "+Thread.currentThread().getPriority());
		Thread.currentThread().setPriority(10);
		System.out.println("Main Thread old Priority is : "+Thread.currentThread().getPriority());
		PriorityThread p = new PriorityThread();
		p.start();
	}

}
