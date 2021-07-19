package Collection;
import java.util.*;

public class Array {

	public static void main(String[] args) {
		 ArrayList <String> Studentname = new ArrayList <String>();
		 Studentname.add("Viren");
		 Studentname.add("Rahul");
		 Studentname.add("Rahul");
		 Studentname.add("Rijwan");
		 Studentname.add("shanu");
		 Studentname.add("Vivek");
		 
		 
		 for(int i=0; i<Studentname.size(); i++) {
			 System.out.println("The Names are : "+Studentname.get(i));
		 }
		 
         System.out.println("==================================================");
         
         System.out.println("Value fetched by For each ....");
         for(String value:Studentname) {
        	 System.out.println("Names are : "+value);
         }
         
         System.out.println("===================================================");
         
        Iterator <String> it = Studentname.iterator();
        
        System.out.println("Value fetched by Iterator ...");
        while(it.hasNext()) {
        	System.out.println("My name is : "+it.next());
        }
		 
		 
		 // for finding object is present or not ....
		 System.out.println(Studentname.contains("Viren"));
		 
		 
		 System.out.println("Name of all students : "+Studentname);
		 
		 
		 // This is for getting array value....
		 System.out.println("Index of name 2 is : "+Studentname.get(2));
		 
		 // This is for Removing array value ....
		 Studentname.remove(2);
		 
		
	
		 Studentname.add(2, "khan");
	     
		 Studentname.remove( String.valueOf("Vivek"));
		 
		 System.out.println("After adding new name fields are :"+Studentname);
		 
		 

		 Studentname.remove(new String("Viren"));
		 System.out.println("After adding new name fields are :"+Studentname);
		 
		 
		 // For clear all the arraylist ....
		 Studentname.clear();
		 System.out.println("After adding new name fields are :"+Studentname);
		 
		 
		 
	}

}
