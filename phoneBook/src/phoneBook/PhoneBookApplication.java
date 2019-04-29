
/*

* Add new entries 
* Search by first name 
* Search by last name 
* Search by city or state
* Delete a record for a given telephone number
* Update the first name on record for a given telephone number
* Show all records in ascending order of their last names
* An option to exit the program 

 */
package phoneBook;

import java.util.ArrayList;

//import java.util.ArrayList;

import java.util.Scanner;

public class PhoneBookApplication {
	
	static ArrayList <Person> people = new ArrayList<>();
	static Scanner input = new Scanner (System.in);
	static Person person1  = new Person();
	static Address newAddress = new Address();
	static PhoneNumber newPhoneNumber = new PhoneNumber ();
	


	public static void main(String[] args) {
			
			System.out.println("Welcome to the Phonebook Application\n");
			System.out.println("Enter 1: Add new entries\n");
			System.out.println("Enter 2: Search by first name\n");
			System.out.println("Enter 3: Search by last name\n");
			System.out.println("Enter 4: Search by city or State\n");
			System.out.println("Enter 5: Delete a record for a given telelphone number\n");
			System.out.println("Enter 6: Show all records in ascending order of their last names\n");
			System.out.println("Enter 7: To exit the phonebook program\n");
				 
			int selection = 0;
			 while (selection!=7) {
				 
			selection = input.nextInt();
			switch(selection){
				case 1: 
					System.out.println("\n Add new entries into the phonebook (First name, last name, city, state, country, zipcode, phone number)");
					addNewEntry();
					break;
				case 2: 
					System.out.println("\n Type contact name to search phonebook by first name");
					break;
				case 3: 
					System.out.println("\n Type contact name to search phonebook by last name");
					break;
				case 4: 
					System.out.println("\n Type name of city or state to search phonebook record");
					break;
				case 5: 
					System.out.println("\n Type telephone number to delete a record from phonebook");
					break;
				case 6: 
					System.out.println("\n Type last name to show all records in ascending order of last names");
					break;
				default: 

					System.out.println("\n You've exited the phonebook program successfully!");
					break;
				
			}	
			 }
			}
				
					public static void addNewEntry() {
						try{
							String selection = input.nextLine();
							String entryArr [ ] = selection.split(",");
							
							person1.setFirstName(entryArr[0]);
							person1.setLastName(entryArr[1]);
							person1.setAddress(entryArr[2]+""+entryArr[3]+""+entryArr[4]+"");
							people.add(person1);
		
						}
						catch(Exception err) {
							System.out.println("Please enter a valid entry");
						}
					}
					
		
		//Person person1 = new Person();
}

	


