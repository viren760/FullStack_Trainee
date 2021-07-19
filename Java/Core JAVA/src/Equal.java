import java.util.Objects;

public class Equal {

	int num ;
	String str ;
	
	public  Equal(int num, String str) {
		
		this.num = num;
        this.str= str; 		
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(num);
	}


	@Override
	public boolean equals(java.lang.Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Equal other = (Equal) obj;
		return num == other.num;
	}


	public static void main(String[] args) {

   Equal e = new Equal(1,"Sony");
   Equal e2 = new Equal(1,"HP");
  
   // They give false because in object == check the refrence and they both belong to diffrent object ...
  System.out.println("============ (==) ============");
   System.out.println(e == e2);
   
   // If we want to check object are equal or not we should create an hash code
   // In this we will create a hash code of number so it will check number is equal or not with the use of .equals
   System.out.println("========== using .equals =======");
   System.out.println(e.equals(e2));
   
   
   int a = 4;
   int b = 4;
   System.out.println("== is used to check primitive integer number ");
   System.out.println(a == b);
   
   
 
   String c = "Viren";
   String d ="Viren";
   System.out.println(".equals() is used to check primite strings");
   System.out.println(d.equals(c));
   
	}

}
