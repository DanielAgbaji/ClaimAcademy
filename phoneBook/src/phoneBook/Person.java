package phoneBook;

import java.util.Comparator;
import java.util.*; 
import java.lang.*; 
import java.io.*; 
import java.util.Collection;

public class Person {
	private String firstName;
	private String lastName;
	private String phoneNumber;
	private Address address;
	
	public Person() {
		
	}
	
	public Person(String firstName, String lastName, Address address, String phoneNumber) {
		this.firstName=firstName;
		this.lastName=lastName;
		this.address = address;
		this.phoneNumber = phoneNumber;
		
		
	}
	
	public  String getFirstName() {
		return this.firstName;
	}
	
	public void setFirstName(String firstName) {
		this.firstName=firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName=lastName;
	}
	public Address getAddress() {
		return this.address;
	}
	public void setAddress(Address address) {
		 this.address=address;
	}
	public String getPhoneNumber() {
		return this.phoneNumber;
	}
	public void setPhoneNumber (String  phoneNumber) {
		this.phoneNumber=phoneNumber;
	}
//	 @Override
//	    public String toString() {
//	        return firstName + ", " + lastName+","+phoneNumber+","+address;
//	    }
//
//	    public static String toString(Collection<Person> people) {
//	        String s = "";
//	        for(Person person : people) {
//	            s += person + "\n";
//	        }
//	        return s;
//	    }

	}
	
	
//	public int compare(Person person1, Person person2) {
//	return person1.getFirstName().compareToIgnoreCase(person2.getFirstName());
//	}
//	
//	class FirstName implements Comparator<Person> 
//	{ 
//	    // Used for sorting in ascending order of 
//	    // fristname
//	 public int compare(Person a, Person b) 
//	    { 
//	        return a.firstName - b.firstName; 
//	    } 
//	
//	}
//	

