class Computer{
	public void os() {
		System.out.println("Windows 10 is here");
	}
	
	public static void config() {
		System.out.println("8gb ram in Computer");
	}
	
	
}

interface Mobile {
public  void  os();	
	
}


public class Anonymusclass {

	public static void main(String[] args) {

		Computer.config();
// Anonymus class in class ...
		Computer c = new Computer () {
			
			public void os() {
				System.out.println("Macbook pro is here");
			}
		};
		
		c.os();
// Anonymus class in Interface ...		
		Mobile m = new Mobile() {

			@Override
			public void os() {
				System.out.println("IoS is here..");
				
			}
			
		};
		m.os();
	}

}
