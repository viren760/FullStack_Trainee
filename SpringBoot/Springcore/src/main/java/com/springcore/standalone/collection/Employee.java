package com.springcore.standalone.collection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Employee {
	
	private String name;
	private List<String> phones;
	private Set<String> address;
	private Map<String, String> course;
	private Properties fav_lang;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getAddress() {
		return address;
	}
	public void setAddress(Set<String> address) {
		this.address = address;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	
	public Properties getFav_lang() {
		return fav_lang;
	}
	public void setFav_lang(Properties fav_lang) {
		this.fav_lang = fav_lang;
	}
	public Employee(String name, List<String> phones, Set<String> address, Map<String, String> course,
			Properties fav_lang) {
		super();
		this.name = name;
		this.phones = phones;
		this.address = address;
		this.course = course;
		this.fav_lang = fav_lang;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", phones=" + phones + ", address=" + address + ", course=" + course
				+ ", fav_lang=" + fav_lang + "]";
	}
		

}
