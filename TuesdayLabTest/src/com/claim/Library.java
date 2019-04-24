package com.claim;
import java.util.ArrayList;
//import java.util.Scanner;
public class Library {

	ArrayList<Patron> patrons = new ArrayList<>();	
	public static void main(String[] args) {
		// Patron object created
		Patron newPatron1 = new Patron();
		
		
		
		// Branch object created
		
		Branch libraryBranch = new Branch("Emporia Public Library",652323, 
				"Emporia Kansas", "emporialibrary@emporia.org", "www.emporialibrary.com");
		
		
		
		
		
		// LibraryResources object created
		
		LibraryResources libraryResource= new LibraryResources("Book", 
				"William Shakespeare", 23220323,"Things Fall Apart",500);
		
		
		
		
			
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
	
	public void addPatron(Patron p)
	{
		patrons.add(p);
	}

}
