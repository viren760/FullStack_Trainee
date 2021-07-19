package Thread;

class Mythread extends Thread{
	public void run() {
		System.out.println("Execute Task 1");
	}
}




public class Main {

	public static void main(String[] args) {
	
		
		Mythread t = new Mythread();
		t.start();

	}

}
