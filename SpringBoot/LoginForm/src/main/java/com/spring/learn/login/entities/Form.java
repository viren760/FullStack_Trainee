package com.spring.learn.login.entities;

public class Form {

	private String userName;
	private String userEmail;
	private String userPassword;

	public Form() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Form(String userName, String userEmail, String userPassword) {
		super();
		this.userName = userName;
		this.userEmail = userEmail;
		this.userPassword = userPassword;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	@Override
	public String toString() {
		return "Form [userName=" + userName + ", userEmail=" + userEmail + ", userPassword=" + userPassword + "]";
	}

}
