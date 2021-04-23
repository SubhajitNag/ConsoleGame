package Default;

import java.util.Scanner;

public class Update{	
	public static void update(Student student) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Which field you want to update ID/Name/Contact/Email/Department ?");	
		String response = scanner.next();
		
		if(response.equals("ID")) {
			System.out.println("ID cannot be modified");	
		} else if (response.equals("Name")) {
			System.out.println("Enter the new Name to update");
			student.setName(scanner.next());
		} else if (response.equals("Contact")) {
			System.out.println("Enter the new Contact to update");
			student.setPhone(scanner.next());
		} else if (response.equals("Email")) {
			System.out.println("Enter the new Email to update");
			student.setEmail(scanner.next());
		} else if (response.equals("Department")) {
			System.out.println("Enter the new Department to update");
			student.setDepartment(scanner.next());
		}else {
			System.out.println("Invalid entry");
		}
		System.out.println("Updated results are");
		Display.display(student);
	}
}
	
	
	

