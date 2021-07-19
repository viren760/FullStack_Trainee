package polymorphism;

public class Vechicle {

	public static void main(String[] args) {

		Car c = new Car ();
		
		Bike b = new Bike();
		
		Car c1= b;
		
// It will show the method which is present in Cars and bikes too.. and also the override method 
// ** not showing the extra method which is present only in bike because bike is child class having own methods too		
		c1.Enginee();
		c1.tyres();
  
	System.out.println("==========polymorphism=======");	
		 petroltank(c); 
	
	}
	
	public static void petroltank(Car c2) {
           c2.Enginee();		
	}
	

}
