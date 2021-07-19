package Thread;

class MyThread extends Thread{
	 public void run() {
//		 change the name of the thread ....
		 Thread.currentThread().setName("Virender Thread");
//       Get the name of the thread ....		 
		 System.out.println("Task Executed : "+Thread.currentThread().getName());
	 }

}

class MyThread2 extends Thread{
	public void run() {
		Thread.currentThread().setName("Viren Thread");
		System.out.println("Task Executed : "+Thread.currentThread().getName());
	}
}

public class BasicMethods {

	public static void main(String[] args) {
		BasicMethods b = new BasicMethods();
		System.out.println("Task Executed : "+Thread.currentThread().getName());
       MyThread m = new MyThread();
       m.start();
       System.out.println(m.isAlive());
       MyThread2 m2 = new MyThread2();
       m2.start();
       System.out.println(m.isAlive());
	}

}
