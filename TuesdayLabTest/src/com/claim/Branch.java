package com.claim;

public class Branch {
	private String branchName;
	private long   branchTelephone;
	private String branchAddress;
	private String branchEmail;
	private String branchWebsite;
	
	//default constructor 
	public Branch() {
		
	}
	//parameterized constructor
	public Branch(String branchName, long branchTelephone, 
			String branchAddress, String branchEmail, String branchWebsite ) {
		this.branchName = branchName;
		this.branchTelephone = branchTelephone;
		this.branchAddress = branchAddress;
		this.branchEmail = branchEmail;
		this.branchWebsite = branchWebsite;
	
	}
	public String getBranchName() {
		return this.branchName;
	}
	public void setBranchName (String branchName) {
		this.branchName=branchName;
		
	}
	public long getBranchTelephone() {
		return this.branchTelephone;
	}
	public void setBranchTelephone(long branchTelephone) {
		this.branchTelephone= branchTelephone;
		
	}
	public String getBranchEmail() {
		return this.branchName;
	}
	public void setBranchEmail(String branchEmail) {
		this.branchEmail= branchEmail;
		
	}
	public String getBranchWebsit() {
		return this.branchWebsite;
	}
	public void setBranchWebsite(String branchWebsite) {
		this.branchWebsite=branchWebsite;
	}
	//create the array of books in this class
	//create the address class and call it here for easy referencing
	
}
