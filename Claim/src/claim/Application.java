package claim;
import java.util.ArrayList;
public class Application {

	public static void main(String[] args) {
		// Creating a student object
		Student newStudent1 = new Student();
		
		// Creating an employee object
		Employee newEmployee = new Employee();
		
		//Creating a person object
		
		Person newPerson = new Employee();
		
		Person newStudent2 = new Student();
		
		
		double newPersonAmount = newPerson.calculateTelephoneBill(120.5);
		 
		System.out.println("The student telephone bill is "+newPersonAmount);
		
		double studentTelephoneBill=newStudent2.calculateTelephoneBill(120.5);
		
		System.out.println("The student telephone bill is "+studentTelephoneBill);
		
		double employeeTelephoneBill = newEmployee.calculateTelephoneBill(120.5);
		System.out.println("The student telephone bill is "+employeeTelephoneBill);
		
		
		ArrayList<Student> newStudents = new ArrayList<>();
		
		ArrayList<Employee> newEmployees = new ArrayList<>();
		
		newStudents.add(newStudent1);
		newEmployees.add(newEmployee);
		
		
	}

	

}
