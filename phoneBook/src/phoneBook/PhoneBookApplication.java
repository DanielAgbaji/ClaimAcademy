
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
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class PhoneBookApplication extends java.lang.Thread implements Comparator {
	
	static ArrayList <Person> people = new ArrayList<>();
	static Scanner input = new Scanner (System.in);
	static Person person1  = new Person();
	static Person person2 = new Person();
    static Address newAddress = new Address();
	
	
// Next line begins with instructions for the users

	public static void main(String[] args) {
			
			System.out.println("Welcome to the Phonebook Application\n");
			System.out.println("Enter 1: Add new entries\n");
			System.out.println("Enter 2: Search by first name\n");
			System.out.println("Enter 3: Search by last name\n");
			System.out.println("Enter 4: Search by city or State\n");
			System.out.println("Enter 5: Delete a record for a given telelphone number\n");
			System.out.println("Enter 6: Update the first name on record for a given telephone number\n");
			System.out.println("Enter 7: Show all records in ascending order of their last names\n");
			System.out.println("Enter 7: To exit the phonebook program\n");
			

				 
// Initialization of selection for the switch statement
			
			int selection = 0;
			
			 while (selection!=7) {
				 
			selection = input.nextInt();
			
			//String selection1 = input. nextLine();
			
			switch(selection){
				case 1: 
					System.out.println("\n Add new entries into the phonebook (First name, last name, city, state, country, zipcode, phone number)");
					addNewEntry();
					break;
				case 2: 
					System.out.println("\n Type contact name to search phonebook by first name");
					searchFirstName();
					break;
				case 3: 
					System.out.println("\n Type contact name to search phonebook by last name");
					searchLastName ();
					break;
				case 4: 
					System.out.println("\n Type name of city or state to search phonebook record");
					searchCity ();
					break;
					
				case 5: 
					System.out.println("\n Type telephone number to delete a record from phonebook");
					deleteRecordByTelephone();
					break;
				case 6: 
					System.out.println ("\n Enter the first name you like to update on record: ");
					updateFristNamebyTelephoneNumber();
					
//					System.out.println("\n Enter the new first name: ");
//					updateFirstName();
					break;
				case 7: 
					System.out.println("\n Type number 6 to sort out the records alphabetically");
					sortRecordsAlphabetically();
					break;
				case 8: 
					System.out.println("\n Type number 7 to sort out the records alphabetically");
				default: 

					System.out.println("\n You've exited the phonebook program successfully!");
					break;
				
			}
			selection = 0;
			
			 }
			}
				
// First use case method to add record in phone book 
	
		public static void addNewEntry() {
						try{
							
							input = new Scanner(System.in);
							String selection = input.nextLine();
							String entryArr [ ] = selection.split(",");
							
							person1.setFirstName(entryArr[0]);
							person1.setLastName(entryArr[1]);
							
							newAddress.setCity(entryArr[2].trim());
							newAddress.setState(entryArr[3].trim());
							newAddress.setCountry(entryArr[4].trim());
							newAddress.setAreaCode(entryArr[5].trim());
							person1.setPhoneNumber(entryArr[6].trim());
							person1.setAddress(newAddress);
							people.add(person1);
							
							
							System.out.println("You have successfully added one entry into the phonebook app");
		
						}
						catch(Exception err) {
							System.out.println("Please enter a valid entry");
						}
					}

// second use case method for user to search record by first name in phonebook
		
		private static void searchFirstName() {
			
							input = new Scanner(System.in);

						  String selection = input.nextLine();
						

						for (Person person : people){
							
							if (person.getFirstName().contains(selection.trim())){
								System.out.println("Phone book record with the first name:"+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
							}
						
						
							else
								System.out.println("The first name you entered is not on record");
						}

}
// Third use case method for user to search record by last name in phonebook 
		

					private static void searchLastName () {
						String selection = input.nextLine();
						for (Person person : people) {
							if (person.getLastName().contains(selection)) {
								System.out.println("Phone book record with the last name: "+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
							}
							else 
								System.out.print("The last name you entered is not on record");
						}
					}
					private static void searchCity () {
						//Address newAddress = new Address(); 
						String selection = input.nextLine();
						for (Person person: people) {
							if (newAddress.getCity().contains(selection)) {
								System.out.println("Phone book record with the city name: "+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
							}
							 if (newAddress.getState().contains(selection)) {
								System.out.println("Phone book record with the state name: "+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
								
								}
							else 
								System.out.print("The state you entered is not on record");
								
							
						}
					}
					
//Fourth use case for user to delete records by the telephone number on phonebook
					
					private static void deleteRecordByTelephone () {
						
						List<Person> people = new ArrayList<Person>();
						String selection = input.nextLine();
						
						for (Person person: people) {
							if (person.getPhoneNumber().equals(selection.trim())){
							
						   System.out.println("The number: "+selection+" you entered is now deleted from record");
								
							people.remove(person);
							
							
							
							}
							else 
								System.out.println("The phone number" +selection+" you entered is not on record");	
						}
					}
					
//Fifth use case method for user to update first name by telephone number on phonebook record 
					
					
					private static void updateFristNamebyTelephoneNumber() {
						
						String selection1 = input.nextLine();
						String selection2 = input.nextLine();
				
						//String entryArr [ ] = selection2.split(",");
						
						List<Person> people = new ArrayList<Person>();
						
							
//						PhoneBookApplication.addNewEntry();
//				        System.out.println(Person.toString(people));
//				        people.get(0).setFirstName(selection1);
//				        System.out.println(Person.toString(people));
//				        System.out.println("end");
				      
						
							for (Person person: people)
					        {
					        
					            
							if(person!=null && person.getFirstName().contains(selection1.trim())) {
					            	
					             
					           
					           person.setFirstName(selection2);
					           
					           System.out.println("The telephone number: "+selection1+" for which you like to update the first name in record is now: "+selection2 );
							}
							else
					        	   System.out.println("No record on phonebook");
					        	   
					        }
					       
					            	
					            }
					            	
					          
					        
					
						@SuppressWarnings("rawtypes")
						private static void sortRecordsAlphabetically() {
							
							ArrayList<Person> people = new ArrayList<Person>();}
				
							   
							 public static void  compare(Person person1, Person person2) {

							            person1.getLastName().compareTo(person2.getLastName());
							   }
						
							
								
								//if(person1.getFirstName().equals(selection1.trim())) {
									
									//people.add(selection2);
								//}
								//else
								//	System.out.println("The firstname you are trying to update is not on record");
		
						

@Override
public int compare(Object o1, Object o2) {
	// TODO Auto-generated method stub
	return 0;
}

					
					

}
					
					
					
	


