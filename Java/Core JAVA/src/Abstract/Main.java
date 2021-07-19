package Abstract;

public class Main {

	public static void main(String[] args) {
		
		Car c = new Car();
		c.setEngine("Hybrid");
		c.start();
		
		System.out.println("Car Engine is "+c.getEngine());
		System.out.println();
		System.out.println("==================================");
		Truck t = new Truck();
		t.setEngine("broad");
        t.start();
		System.out.println("Truck Engine is "+t.getEngine());
	}

}
