package com.springcore.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	ApplicationContext context	= new ClassPathXmlApplicationContext("com/springcore/collection/CollectionConfig.xml");
    Employee emp = (Employee) context.getBean("emp");
    
    System.out.println(emp.getName());
    System.out.println(emp.getPhones());
    System.out.println(emp.getAddress());
    System.out.println(emp.getCourse());
    System.out.println(emp.getFav_lang());
	}

}
