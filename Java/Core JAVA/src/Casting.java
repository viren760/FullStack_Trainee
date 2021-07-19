
public class Casting {

	public static void main(String[] args) {
		
		byte bytevalue= 7;
		int integervalue = 23;
		 short  shortvalue = 12;
		 long longvalue= 23435;
        String strvalue ="200";
		 double doublevalue = 234.564;
		 float floatvalue = 23.43f;
		 
		 System.out.println("Byte Range");
		 System.out.println(Byte.MAX_VALUE);
		 System.out.println(Byte.MIN_VALUE);
		 System.out.println("=========================");
		 System.out.println("Short Range");
		 System.out.println(Short.MAX_VALUE);
		 System.out.println(Short.MIN_VALUE);
		 System.out.println("==========================");
		 System.out.println("Integer Range");
		 System.out.println(Integer.MAX_VALUE);
		 System.out.println(Integer.MIN_VALUE);
		 System.out.println("==========================");
		 System.out.println("Long Range");
		 System.out.println(Long.MAX_VALUE);
		 System.out.println(Long.MIN_VALUE);
		 System.out.println("==========================");
		 System.out.println("Float Range");
		 System.out.println(Float.MAX_VALUE);
		 System.out.println(Float.MIN_VALUE);
		 System.out.println("==========================");
		 System.out.println("Double Range");
		 System.out.println(Double.MAX_VALUE);
		 System.out.println(Double.MIN_VALUE);
		 
		 
		 
	// casting of long into integer	 
	 integervalue =  (int) longvalue;
	 System.out.println("===== This is to convert long to int ========");
	 System.out.println(integervalue);
	 
	 integervalue = (int) floatvalue;
	 System.out.println("====== This is to convert float to int =========");
	 System.out.println(integervalue);
	 
	 integervalue = (int) doublevalue;
	 System.out.println("===== This is to convert double to int =========");
	 System.out.println(integervalue);
	 
	 floatvalue = integervalue;
	 System.out.println("====== This is to convert integer into float=======");
	 System.out.println(floatvalue);
	 
	 integervalue = Integer.parseInt(strvalue);
	 System.out.println("======== This is to convert String into Integer =========");
	 System.out.println(integervalue);
	 System.out.println("=========== Adding two integer=========");
	 System.out.println("This will adding two integer"+integervalue+integervalue);
	 
	 strvalue = Integer.toString(integervalue) ;
	 System.out.println("======== This is to covert integer into String ===========");
	 System.out.println(strvalue);
	 
	 int ivalue=100;
	 strvalue = Integer.toString(ivalue);
	 System.out.println("================Adding two Strings===========");
	 System.out.println("this will concatinate two strings"+strvalue+strvalue);
	}
	
	

}
