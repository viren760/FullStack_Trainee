package com.Student_manage;

public class Student {

	private int studentId;
	private String studentName;
	private String studentCity;
	private String studentPhone;
	
// Generate constructor  using all field ...	
	public Student(int studentId, String studentName, String studentCity, String studentPhone) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPhone = studentPhone;
	}

// Generate constructor except first field ...	
	public Student(String studentName, String studentCity, String studentPhone) {
		super();
		this.studentName = studentName;
		this.studentCity = studentCity;
		this.studentPhone = studentPhone;
	}
	
	
// Generate a constructor with super class
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
//Generate getter setter for all field...
	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentCity() {
		return studentCity;
	}

	public void setStudentCity(String studentCity) {
		this.studentCity = studentCity;
	}

	public String getStudentPhone() {
		return studentPhone;
	}

	public void setStudentPhone(String studentPhone) {
		this.studentPhone = studentPhone;
	}

	
//	Generate toString for all fields..
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentCity=" + studentCity
				+ ", studentPhone=" + studentPhone + "]";
	}
	
	
	
}
