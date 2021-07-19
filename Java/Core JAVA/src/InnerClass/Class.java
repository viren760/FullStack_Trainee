package InnerClass;

public class Class {

	public int id ;
    public int no; 
	public static String cname="Human";
	public static int idno=3113;
	
	public void Studentno(int id) {
		System.out.println("Machine no is : "+id+" \n"+"My id is :"+idno);
	}
	
	private String name;
		
		
		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}

// inner class		
		class Employee{
		
		public void empname(String name) {
			System.out.println("Employee name is : "+name);
		}
	}
	
	public static void myroll() {
		System.out.println("My roll no is : "+idno);
		
		
	  
	}
// inner static class 
	static class Human {
		

		
		public void Category() {
			
			System.out.println("My category is :"+cname);
		}
	}
	

	public void run () {
	 
		System.out.println("run");
		
		Employee e = new Employee();
		e.empname("Virender");
		
		class Test {
		
			private String me="Virender Negi";
			public void sayhello(int id) {
				System.out.println("say hello "+id+" times");
				System.out.println("Say hello to : "+me);
			}
			
		}
		Test t = new Test();
		t.sayhello(2);

	}

	
	
}
