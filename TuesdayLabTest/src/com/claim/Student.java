package com.claim;

public class Student {
	private String firstName=" ";
	private String lastName = "";
	private String address = "";
	private double GPA = 0;
	private int age = 0;
	private String telephone="";
	private String sex = "";
			
	
	public Student() {
		
		
		
	}
	
	public Student(String firstName, String lastName, String address, 
			
			double GPA, int age, String telephone, String sex ) {
		
		
		this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.GPA=GPA;
		this.age=age;
		this.telephone=telephone;
		this.sex=sex;
		
	}
	public String getFirstName() {
		
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		
		this.firstName=firstName;
	}
	public String getLastName() {
		return this.lastName;
		
	}
	
	public void setLastName (String lastName) {
		
		 this.lastName=lastName;
	}
	public  String getAddress() {
		return this.address;
	}
	public void setAddress(String address) {
		
		this.address=address;
		
	}
	public  String getTelephone() {
		return this.telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone=telephone;
	}
	public String getSex() {
		
		return this.sex;
	}
	public void setSex(String sex) {
		this.sex=sex;
	}

	 

	

}
