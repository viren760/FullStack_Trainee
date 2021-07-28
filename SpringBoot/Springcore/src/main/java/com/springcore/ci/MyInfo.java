package com.springcore.ci;

public class MyInfo {

	private String name;
	private String rollno;
	private Col College;
	public MyInfo(String name, String rollno, Col college) {
		super();
		this.name = name;
		this.rollno = rollno;
		College = college;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "My name is "+this.name+" . \nMy roll no is : "+this.rollno+" . \nI have completed my "+this.College.CourseName+" from "+this.College.College+" with overall CGPA of "+this.College.Cgpa;
	}
	
	
	
}
