package com.thalapathi.spring.springMVC.model;

import java.util.LinkedHashMap;

public class Student {
	
	private String firstName;
	private String lastName;
	private LinkedHashMap<String,String> options;
	private String sex;
	private String email;
	private String password;
	
	public Student() {
		options = new LinkedHashMap<String, String>();
		options.put("M", "Male");
		options.put("F", "Female");
	}
	
	
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LinkedHashMap getOptions() {
		return options;
	}
	public void setOptions(LinkedHashMap options) {
		this.options = options;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}


	public String getSex() {
		return sex;
	}


	public void setSex(String sex) {
		this.sex = sex;
	}
	
	

}
