package com.springcore.lifecycle;

public class Addition {
	
private int x;
private int y;
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
public Addition(int x, int y) {
	super();
	this.x = x;
	this.y = y;
}
public Addition() {
	super();
	// TODO Auto-generated constructor stub
}

public void init() {
	System.out.println("Initalised");
}

public void destroy() {
	System.out.println("Destroyed");
}


@Override
public String toString() {
	return "Addition [x=" + x + ", y=" + y + "]";
}



}
