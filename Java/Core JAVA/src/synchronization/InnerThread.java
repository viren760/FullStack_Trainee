package synchronization;

class TotalPrice extends Thread{
	
	int total_amt=0;
	
	public void run() {
		synchronized(this) {
			for(int i=1; i<=10; i++) {
				 total_amt= total_amt+100;	
				
			}
			this.notify();
		}
		
	
	}
}



public class InnerThread {

	public static void main(String[] args)throws InterruptedException {
      TotalPrice tp = new TotalPrice();
      tp.start();
     
      synchronized(tp) {
    	  tp.wait();
          System.out.println("Total Price is :"+tp.total_amt+" Rs");

      }

	}

}
