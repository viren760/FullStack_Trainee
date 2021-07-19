package polymorphism;

public class Bike extends Car {

	@Override
	public void tyres() {
		System.out.println(" having 2 tyres");
	}
	
	public void handles() {
		System.out.println(" having 2 handles");
	}
	
}
