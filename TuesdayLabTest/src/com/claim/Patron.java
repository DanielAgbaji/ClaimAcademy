package com.claim;

import java.util.ArrayList;

public class Patron {
	
	ArrayList<LibraryResources> books = new ArrayList<>();
	private String patronFirstName= "";
	
	private String patronLastName= "";
	
	private int patronAge;
	
	private String patronSex ;
	
	private String patronAddress= "";
	
	private String patronCategory= "";
	
	private String patronLibraryCardNumber = "";
	
	public Patron () {
		
	}
	
	public Patron (String patronFirstName, 
			String patronLastName, int patronAge, String patronSex, 
			String patronAddress,  String patronCategory, 
			String patronLibraryCardNumber) {
		
		this.patronFirstName=patronFirstName;
		this.patronLastName=patronLastName;
		this.patronAge = patronAge;
		this.patronAddress=patronAddress;
		this.patronSex=patronSex;
		this.patronCategory=patronCategory;
		this.patronLibraryCardNumber=patronLibraryCardNumber;
		
		
		
	}
	
	
	
	public String getPatronFirstName() {
		return this.patronFirstName;
		
	}
	public void setPatronFirstName(String patronFirstName) {
		this.patronFirstName=patronFirstName;
	}
	public String getPatronLastName() {
		
		return this.patronLastName;
	}
	public void setPatronLastName(String patronLastName) {
		
		this.patronLastName=patronLastName;
	}
	public int getPatronAge() {
		return this.patronAge;
	}
	public void setPatronAge(int patronAge) {
		this.patronAge=patronAge;
	}
	public String getPatronSex() {
		return this.patronSex;
	}
	public void setPatronSex(String patronSex) {
		this.patronSex=patronSex;
	}
	public String getPatronAddress() {
		return this.patronAddress;
	}
	
	public void setPatronAddress (String patronAddress) {
		this.patronAddress=patronAddress;
	}

	public String getPatronCategory () {
		return this.patronCategory;
	}
	public void setPatronCategory(String patronCategory) {
		this.patronCategory=patronCategory;
	}
	public String getPatronLibraryCardNumber() {
		return this.patronLibraryCardNumber;
	}
	public void setPatronLibraryCardNumber(String patronLibraryCardNumber) {
		this.patronLibraryCardNumber=patronLibraryCardNumber;
	}
//create an array of books for the books
// create a class address with the Zip code and all that. 

	@Override
	public String toString() {
		return "Patron [patronFirstName=" + patronFirstName + ", patronLastName=" + patronLastName + ", patronAge="
				+ patronAge + ", patronSex=" + patronSex + ", patronAddress=" + patronAddress + ", patronCategory="
				+ patronCategory + ", patronLibraryCardNumber=" + patronLibraryCardNumber + "]";
	}
	
	
}
