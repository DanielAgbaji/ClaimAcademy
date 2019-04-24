package com.claim;

public class Student {
	private String firstName=" ";
	private String lastName = "";
	private String address = "";
	private double GPA = 0;
	private int age = 0;
	private int telephone=0;
	private String sex = "";
			
	
	public Student() {
		
		
		
	}
	
	public Student(String firstName, String lastName) {
		
		
		this.firstName=firstName;
		this.lastName=lastName;
		
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
	public void setAddress(String Address) {
		
		this.address=address;
		
	}
	public  int getTelephone() {
		return this.telephone;
	}
	public void setTelephone() {
		this.telephone=telephone;
	}
	 

	

}
