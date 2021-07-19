package com.springcore.ref;

public class A {
	
	private int X;
	private B obj;
	public int getX() {
		return X;
	}
	public void setX(int x) {
		X = x;
	}
	public B getObj() {
		return obj;
	}
	public void setObj(B obj) {
		this.obj = obj;
	}
	public A(int x, B obj) {
		super();
		X = x;
		this.obj = obj;
	}
	public A() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "A [X=" + X + ", obj=" + obj + "]";
	}
	
	

}
