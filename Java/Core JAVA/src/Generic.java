import java.util.ArrayList;
import java.util.List;



public class Generic {

 public static void main (String []arg) {
	 
List <Integer> l = new ArrayList();

  l.add(1);
  l.add(2);
  l.add(3);
  l.add(4);
  l.add(5);
  
  System.out.println("old array : "+l);
 System.out.println("we have removed : "+l.remove(2)); 
System.out.println("New Array are : "+l);  
  System.out.println("index of 1  array list : "+l.get(1));
  System.out.println("adding 3 in index 2 :");
  l.add(2, 3);
  System.out.println("last final array :"+l);
	 
 }
}
