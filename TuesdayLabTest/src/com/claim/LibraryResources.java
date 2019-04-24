package com.claim;

public class LibraryResources {
	private String resourceType; 
	private String author;
	private int isbn;
	private String title;
	private int numberOfPages;
	
	public LibraryResources() {
		
	}
	public LibraryResources(String resourceType, String author, int isbn, 
			String title, int numberOfPages) {
		
		this.author=author;
		this.isbn=isbn;
		this.title=title;
		this.numberOfPages=numberOfPages;
		
	}
	
	public String getResourceType() {
		return this.resourceType;
	}
	public void setResourceType(String resourceType) {
		this.resourceType=resourceType;
	}
	public String getAuthor() {
		return this.author;
	}
	public void setAuthor(String author) {
		this.author=author;
	}
	public int getISBN() {
		return this.isbn;
	}
	public void setISBN(int isbn) {
		this.isbn=isbn;
	}
	public String getTitle() {
		return this.title;
	}
	public void setISBN(String title) {
		this.title=title;
	}

	public int getNumberOfPages() {
		return this.numberOfPages;
	}
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages=numberOfPages;
	}
	

}
