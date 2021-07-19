class Students{
	
	public  String name;
	// creating static keyword ...
	public static  final String heading="STUDENTS INFORMATION";
	public static String  bp;
	public static String snames;
	public static int  count=0;
	
	
	public Students() {
		count++;
	}
	
	// we can use static and non static keyword in methods
	public void Students(){
		System.out.println( name+" is enrolled in "+bp);
	}
	
	
	public static void Course() {
	// we can use static variable in static methods ....
//		System.out.println(heading);
		System.out.println("JAVA PROGRAMM");
	}
}


public class Staticc {

	public static void main(String[] args) {
  
		System.out.println("==============="+Students.heading+"==============");
	  
	// creating and initialize static method .....	
	Students.Course();
	
	Students.bp="Backend Programming";
	
	System.out.println("Before creating an object"+Students.count);
	Students s = new Students();
    Students s1 = new Students();
    System.out.println("============================================");
    System.out.println(" After creating an object"+Students.count);
    Students.snames="STUDENTS NAMES";
    System.out.println(Students.snames);
    s.name="1. virender";
    s1.name="2. rijwan";
    
    s.Students();
    s1.Students();
	
	}

}
