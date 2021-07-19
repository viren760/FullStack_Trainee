
public class strings {

	public static void main(String[] args) {
		
		int anum = 10;
		double dnum = 23.9986793269;
		
		String name = "Virender";
		String Blank = " ";
        String middle = "Singh";
        String Lastname = "Negi";
        
        String full = name +Blank + middle + Blank +Lastname; 
        
        System.out.println("========STRINGS========");
        
        System.out.println("My Name is :"+name+Blank+middle+Blank+Lastname);
        System.out.println("Virender"+" "+"Negi");
        System.out.println(full);
//        here we concatinate the number with one coma between it ..
        System.out.println("My number is :"+anum +","+dnum );
	}

}
