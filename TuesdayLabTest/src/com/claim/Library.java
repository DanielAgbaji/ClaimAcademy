package com.claim;

public class Library {

	public static void main(String[] args) {
		Patron newPatron1 = new Patron();
		
		Branch branch = new Branch();
		
		Branch libraryBranch = new Branch();
		
		LibraryResources libraryResource= new LibraryResources("Book", 
				"William Shakespeare", 23220323,"Things Fall Apart",500);
		
		
		
		
		
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
			
			System.out.println("Details of Resources Patron Borrowed"
					+"\n"+"Type: "
					+libraryResource.getResourceType()
					+"\n "+"Author:"
					+libraryResource.getAuthor()
					+"\n "+"Title:"
					+libraryResource.getTitle()
					+"\n " +"ISBN: "
					+libraryResource.getISBN()
					);
			
			
			
	

	
		
	}

}
