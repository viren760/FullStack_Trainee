package Thread;

class Firstthread extends Thread{
	public void run() {
		System.out.println("Execute Task 1");
	}
}


public class Main2 {

	public static void main(String[] args) {
	
		Firstthread f = new Firstthread();
		f.start();
		
		try {
			f.sleep(1000);	
		}catch(Exception e) {
			
		}
		
		
		
		Firstthread f2 = new Firstthread();
		f2.start();
		
		try {
			f2.sleep(1000);	
		}catch(Exception e) {
			
		}
		
		
		Firstthread f3 = new Firstthread();
		f3.start();

		try {
			f3.sleep(1000);	
		}catch(Exception e) {
			
		}
		
		Firstthread f4 = new Firstthread();
		f4.start();
		
		try {
			f4.sleep(1000);	
		}catch(Exception e) {
			
		}
		
	}

}
