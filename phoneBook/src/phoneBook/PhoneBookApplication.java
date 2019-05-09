
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
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;



public class PhoneBookApplication extends java.lang.Thread {
	
	static ArrayList <Person> people = new ArrayList<>();
	static Scanner input = new Scanner (System.in);
	static Person person1  = new Person();
    static Address newAddress = new Address();
	
	


	public static void main(String[] args) {
			
			System.out.println("Welcome to the Phonebook Application\n");
			System.out.println("Enter 1: Add new entries\n");
			System.out.println("Enter 2: Search by first name\n");
			System.out.println("Enter 3: Search by last name\n");
			System.out.println("Enter 4: Search by city or State\n");
			System.out.println("Enter 5: Delete a record for a given telelphone number\n");
			System.out.println("Enter 6: Show all records in ascending order of their last names\n");
			System.out.println("Enter 7: To exit the phonebook program\n");
			
			Scanner input = new Scanner (System.in);
			
			
				 
			
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
					System.out.println("\n Type last name to show all records in ascending order of last names");
					break;
				case 7: 
					System.out.println("\n Type number 7 to exit the application");
					break;
				default: 

					System.out.println("\n You've exited the phonebook program successfully!");
					break;
				
			}
			selection = 0;
			
			 }
			}
				
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

					private static void searchFirstName() {
							//String[] entryArr = null;
							//person1.setLastName(entryArr[1]);
							//input = new Scanner (System.in);

						String selection = input.nextLine();
						
						selection = selection.toLowerCase();

						for (Person person : people){
							
							if (person.getFirstName().contains(selection)){
								System.out.println("Phone book record with the first name:"+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
							}
						
							else
								System.out.println("The first name you entered is not on record");

}

}
					
//					private static String toLowerCase(String selection) {
//						// 
//						return null;
//					}

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
						Address newAddress = new Address(); 
						String selection = input.nextLine();
						for (Person person: people) {
							if (newAddress.getCity().contains(selection)) {
								System.out.println("Phone book record with the last name: "+selection+"\n"+ person.getFirstName()+","
										+person.getLastName()+","+person.getPhoneNumber()+","+newAddress.getCity()+","
										+newAddress.getState()+","+newAddress.getCountry()+","+newAddress.getAreaCode());
							}
							else 
								System.out.print("The city you entered is not on record");
								
							
						}
					}
					private static void deleteRecordByTelephone () {
						
						List<Person> people = new ArrayList<Person>();
						
						for (Iterator <Person> person = people.iterator(); people.hasNext()) {
							String selection = person.nextLine();
							if (person.getPhoneNumber().equals(selection.trim())) {
								person.remove(person); 
								
								System.out.println("The number: "+selection+"you entered is now deleted from record");
							}
							else 
								System.out.println("The phone number" +selection+"you entered is not on record");
							

						
					}
}
					
}
	


