package phoneBook;

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
		return firstName;
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
	
	
	

}
