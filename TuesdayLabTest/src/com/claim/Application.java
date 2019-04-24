package com.claim;

public class Application {
	
public static void main(String[] args) {
	
	Student newFirstStudent = new Student();
	
	Student newSecondStudent = new Student("Daniel", "Agbaji");
	
	
	System.out.println(newSecondStudent.getFirstName() +" "+ newSecondStudent.getLastName());
	

	}

}
