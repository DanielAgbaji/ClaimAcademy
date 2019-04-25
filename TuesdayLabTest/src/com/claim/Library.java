package com.claim;
import java.util.ArrayList;
import java.util.Scanner;
public class Library {
	 // Creating a Patron array list
	
	static ArrayList<Patron> patrons = new ArrayList<>();	
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
			Scanner input1 = new Scanner (System.in);
			
			System.out.println ("Enter the information resource type: ");
			
			String resourceType = input1.next();
			
		
			
			System.out.println ("Enter the Author of the Book: ");
			
			String author = input1.next();
			
			
			String title = input1.next();
			
			System.out.println ("Enter the Title of the Book: ");
			
		
			
			System.out.println ("Enter the ISBN of the Book: ");
			
			String isbn = input1.next();
			addPatron(newPatron1);
			System.out.println("Your new patron information is :"+newPatron1);
		
	}
	
	public static void addPatron(Patron p)
	{
		patrons.add(p);
	}

}
