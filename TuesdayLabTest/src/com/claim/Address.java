package com.claim;

public class Address {
	
	private String street;
	private String apartmentNumber;
	private String city;
	private String state;
	private String zipCode;
	private String country;
	
	
	public Address () {
		
	}
	
	public Address(String street,String apartmentNumber,
	 String city, String state, String zipCode, String country) {
		this.street= street;
		this.apartmentNumber=apartmentNumber;
		this.zipCode=zipCode;
	}
	
	public String getStreet() {
		return this.street;
	}
	
	public void setStreet(String street) {
		this.street=street;
	}
	public String getApartmentNumber() {
		return this.apartmentNumber;
	}
	public void setApartmentNumber(String apartmentNumber) {
		 this.apartmentNumber = apartmentNumber;
	}
	public String getCity() {
		return this.city;
	}
	public void setCity(String city) {
		 this.city = city;
	}
	public String getState() {
		return this.city;
	}
	public void setState(String state) {
		 this.state = state;
	}
	public String getZipCode() {
		return this.zipCode;
	}
	public void setZipCode(String zipCode) {
		 this.zipCode = zipCode;
	}
	public String getCountry() {
		return this.country;
	}
	public void setCountry(String country) {
		 this.country = country;
	}




}
