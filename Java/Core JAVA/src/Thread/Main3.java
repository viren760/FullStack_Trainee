package Thread;

class MyThread1 extends Thread{

	public void run() {
		System.out.println("Task 1");
	}
}

class MyThread2 extends Thread{

	public void run() {
		System.out.println("Task 2");
	}
}

class MyThread3 extends Thread{

	public void run() {
		System.out.println("Task 3");
	}
}

public class Main3 {

	public static void main(String[] args) {
		MyThread1 m = new MyThread1();
		m.start();
		
		try {
			m.sleep(1000);	
		}catch(Exception e) {
			
		}
		
		MyThread2 m2 = new MyThread2();
		m2.start();
		
		try {
			m2.sleep(1000);	
		}catch(Exception e) {
			
		}
        
		MyThread3 m3 = new MyThread3();
		m3.start();
		
		try {
			m3.sleep(1000);	
		}catch(Exception e) {
			
		}


	}

}
