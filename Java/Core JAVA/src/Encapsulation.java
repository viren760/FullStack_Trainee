
public class Encapsulation {

	
// this is data hiding ...	
	private String name ;
	public static final String cast="Negi";
	
	
	
// then we will get this data 	
	public String getName() {
		return name;
	}


// first we will set a data 
	public void setName(String name) {
		this.name = name;
	}




	public static void main(String[] args) {

     Encapsulation e = new Encapsulation();
     
     e.setName("Virender");
     System.out.println("My Name is : "+e.getName()+" "+Encapsulation.cast);

	}

}
