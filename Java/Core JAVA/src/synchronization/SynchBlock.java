package synchronization;

class BookThreaterSeat{
	int total_seat=10;
	 void bookSeat(int seats) {
	System.out.println("hi");
	System.out.println("hi");
	System.out.println("hi");
	System.out.println("hi");
		 
		 synchronized (this){
			 if(total_seat>=seats) {
					System.out.println("Seat Booked Successfully ....");
					total_seat = total_seat - seats;
					System.out.println("Seats left : "+total_seat);
				}else {
					System.out.println("Sorry Seats cannot be Booked ....");
					System.out.println("seats left : "+total_seat);
				}
		 }
		    System.out.println("hi");
		 	System.out.println("hi");
			System.out.println("hi");
			System.out.println("hi");
			
	}
}

public class SynchBlock extends Thread {
static BookThreaterSeat b;
int seats;
public void run() {
	b.bookSeat(seats);
}
	
	public static void main(String[] args) {
		b= new BookThreaterSeat();
		SynchBlock viren = new SynchBlock();
		viren.seats=7;
		viren.start();
 		
		SynchBlock rijwan = new SynchBlock();
		rijwan.seats=7;
		rijwan.start();
	}

}