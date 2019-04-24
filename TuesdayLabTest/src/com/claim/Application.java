package com.claim;

public class Application {
	
public static void main(String[] args) {
	
	Student newFirstStudent = new Student();
	
	Student newSecondStudent = new Student("Daniel", "Agbaji", "Emporia, Kansas", 4.0,100,"6207573692","Male");
	
	
	System.out.println(newSecondStudent.getFirstName() +" "+ 
	newSecondStudent.getLastName()+" lives in, "
	+newSecondStudent.getAddress()+". His phone number is, "
	+newSecondStudent.getTelephone()+", and he is a "+newSecondStudent.getSex()+".");
	

	}

}