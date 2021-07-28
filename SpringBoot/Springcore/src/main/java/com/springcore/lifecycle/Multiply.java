package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Multiply implements InitializingBean, DisposableBean {
	private int a;
	private int b;
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public Multiply(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}
	public Multiply() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Multiply [a=" + a + ", b=" + b + "]";
	}
	public void afterPropertiesSet() throws Exception {
		// init
		System.out.println("Initalise the multiply value ....");
		
	}
	public void destroy() throws Exception {
		// destroy
		System.out.println("Destroy the multiply value ....");
		
	}
	
	

}
