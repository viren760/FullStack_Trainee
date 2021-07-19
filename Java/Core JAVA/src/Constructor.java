 class Programm {
	
	 int value;
	 String name;
	 
	// Default Constructor ... 
	 public Programm() {
		 this(5);
		 System.out.println("First Constructor");
	 }
	 public Programm(int value) {
		 this(5,"Hi");
		 this.value= value;
		 System.out.println(" Second Constructor "+value);
	 }
	 public Programm(int value, String name) {
		 this.value= value;
		 this.name=name;
		 System.out.println(value+" Third Constructor "+ name);
	 }
	 
}


public class Constructor {

	public static void main(String[] args) {
		
		Programm p = new Programm ();
		Programm p1 = new Programm (311);
		Programm p2 = new Programm (3, "virender");
	}

}
