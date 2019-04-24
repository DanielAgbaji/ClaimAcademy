package com.claim;

public class Librarian {
	private String librarianFirstName= "";
	
	private String librarianLastName= "";
	
	private int    librarianAge;
	
	private String librarianSex ;
	
	private String librarianAddress= "";
	
	private String librarianJobTitle= "";
	
	private String librarianRank;

	//default constructor
	public Librarian () {
		
	}
	//parameterized constructor
	
	public Librarian (String LibrarianFirstName, 
			String LibrarianLastName, int LibrarianAge, String LibrarianSex, 
			String LibrarianAddress,  String LibrarianJobTitle, 
			String librarianRank) {
		
		this.librarianFirstName=LibrarianFirstName;
		this.librarianLastName=LibrarianLastName;
		this.librarianAge = LibrarianAge;
		this.librarianAddress=LibrarianAddress;
		this.librarianSex=LibrarianSex;
		this.librarianJobTitle=LibrarianJobTitle;
		this.librarianRank=librarianRank;
		
		
		
	}
	
	
	
	public String getLibrarianFirstName() {
		return this.librarianFirstName;
		
	}
	public void setPatronFirstName(String librarianFirstName) {
		this.librarianFirstName=librarianFirstName;
	}
	public String getPatronLastName() {
		
		return this.librarianFirstName;
	}
	public void setLibrarianLastName(String LibrarianLastName) {
		
		this.librarianLastName=LibrarianLastName;
	}
	public int getLibrarianAge() {
		return this.librarianAge;
	}
	public void setPatronAge(int LibrarianAge) {
		this.librarianAge=LibrarianAge;
	}
	public String getPatronSex() {
		return this.librarianSex;
	}
	public void setPatronSex(String patronSex) {
		this.librarianSex=patronSex;
	}
	public String getPatronAddress() {
		return this.librarianAddress;
	}
	
	public void setPatronAddress (String patronAddress) {
		this.librarianAddress=patronAddress;
	}

	public String getlibrarianJobTitle () {
		return this.librarianJobTitle;
	}
	public void setlibrarianJobTitle(String librarianJobTitle) {
		this.librarianJobTitle=librarianJobTitle;
	}
	public String getLibrarianRank() {
		return this.librarianRank;
	}
	public void setPatronLibraryCardNumber(String librarianRank) {
		this.librarianRank=librarianRank;
	}
	
	public void addPatron() {

		
		Patron newPatron2 = new Patron ("Daniel", "Agbaji", 
				29,"Male", "Emporia, Kansas", "Student", "DA-323232"); 
				
			System.out.println( "Welcome to the Kansas Library System"
			+"\n"+"Patron's Details\n"+"Name: "+newPatron2.getPatronFirstName()+
					
					" "+newPatron2.getPatronLastName()+"\n " +"Age: "
					+newPatron2.getPatronAge()+"\n "+"Sex: "
					+newPatron2.getPatronSex()+"\n"+"Address:"
					+newPatron2.getPatronAddress()+"\n "+"Category: "
					+newPatron2.getPatronCategory()+"\n "+"Library Card NO: "
					+newPatron2.getPatronLibraryCardNumber());
			
			
			Library l = new Library();
			l.addPatron(newPatron2);
		
	}
}
