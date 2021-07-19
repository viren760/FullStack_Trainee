package com.springcore.autowire.annotation;

public class Address {
	
private int house_no;
private String street;
private String city;
private int pincode;
public int getHouse_no() {
	return house_no;
}
public void setHouse_no(int house_no) {
	this.house_no = house_no;
}
public String getStreet() {
	return street;
}
public void setStreet(String street) {
	this.street = street;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public Address(int house_no, String street, String city, int pincode) {
	super();
	this.house_no = house_no;
	this.street = street;
	this.city = city;
	this.pincode = pincode;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Address [house_no=" + house_no + ", street=" + street + ", city=" + city + ", pincode=" + pincode + "]";
}

}
