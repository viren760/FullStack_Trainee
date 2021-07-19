package synchronization;

// Synchronized method ......

class BookThreaterSeat{
	int total_seat=10;
	synchronized void bookSeat(int seats) {
		if(total_seat>=seats) {
			System.out.println("Seat Booked Successfully ....");
			total_seat = total_seat - seats;
			System.out.println("Seats left : "+total_seat);
		}else {
			System.out.println("Sorry Seats cannot be Booked ....");
			System.out.println("seats left : "+total_seat);
		}
	}
}

public class Sync extends Thread {
static BookThreaterSeat b;
int seats;
public void run() {
	b.bookSeat(seats);
}
	
	public static void main(String[] args) {
		b= new BookThreaterSeat();
		Sync viren = new Sync();
		viren.seats=7;
		viren.start();
 		
		Sync rijwan = new Sync();
		rijwan.seats=7;
		rijwan.start();
	}

}
