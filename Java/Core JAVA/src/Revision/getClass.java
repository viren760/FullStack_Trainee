package Revision;

import java.lang.reflect.Method;

public class getClass {

	public static void main(String[] args) {
	
		int count= 0;
		Object o = new String ("Viren");
		Class c = o.getClass();
		System.out.println("Fully Qualified name of class :"+c.getName());
		Method [] m = c.getDeclaredMethods();
		System.out.println("Method Information :");
		for(Method m1:m)
		{
			count ++;
			System.out.println(m1.getName());
		}
		
		System.out.println("The number of total methods are :"+count);
	}

}
