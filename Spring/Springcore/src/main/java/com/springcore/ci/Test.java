package com.springcore.ci;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

	ApplicationContext context  =	new ClassPathXmlApplicationContext("com/springcore/ci/CiConfig.xml");
       MyInfo m   = (MyInfo) context.getBean("myinfo");
      System.out.println(m);
	}

}
