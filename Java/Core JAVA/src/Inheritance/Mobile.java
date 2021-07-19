package Inheritance;

public class Mobile {

	public static void main(String[] args) {
         
	  System.out.println(Nokia.Nname);
	  
	  System.out.println(Nokia.Nbio);
		
		Nokia ni = new Nokia ();
		
		ni.call();
		ni.message();
		ni.radio();
		
		
		System.out.println(Mi.Mname);
		Mi m =  new Mi();

		m.call();
		m.message();
		m.radio();
		m.Bluetooth();
		m.TouchScreen();
		m.Internet();
	}

}
