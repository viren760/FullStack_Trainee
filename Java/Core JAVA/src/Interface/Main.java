package Interface;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer c = new Computer();
		c.os();
		c.serialno();
		Vehicle v = new Vehicle();
		Information i = new Computer();
		v.driving();
		v.serialno();
		System.out.println("=============");
		
		createserialno(c);
		createserialno(v);
	
	}
	
	public static void createserialno(Information i) {
		i.serialno();
	}

}
