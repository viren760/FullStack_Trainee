package com.springcore.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
	  AbstractApplicationContext context =	new ClassPathXmlApplicationContext("com/springcore/lifecycle/liConfig.xml");
     Addition add = (Addition) context.getBean("add");
     System.out.println(add);
     context.registerShutdownHook();
     System.out.println();
     System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
	 System.out.println();
	Multiply mul = (Multiply) context.getBean("mul");
	System.out.println(mul);
	System.out.println("++++++++++++++++++++++++++++++++++++");
	Divide div = (Divide) context.getBean("div");
	System.out.println(div);
	}

}
