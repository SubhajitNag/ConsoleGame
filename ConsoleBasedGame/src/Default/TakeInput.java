package Default;

import java.util.Scanner;

public class TakeInput {
		
	public static void takeInput() {

		Scanner scanner = new Scanner(System.in);
		Student student = new Student();

		System.out.println("Please enter the student ID :");
		student.setId(scanner.next());

		System.out.println("Please enter the student Name :");
		student.setName(scanner.next());

		System.out.println("Please enter the student Phone number :");
		student.setPhone(scanner.next());

		System.out.println("Please enter the email id :");
		student.setEmail(scanner.next());

		System.out.println("Please enter the student dapartment :");
		student.setDepartment(scanner.next());
		
		
		System.out.println("Press 1 to update");
		System.out.println("Press 2 to display");
		int response = scanner.nextInt();
		if(response==1) {			
			Update.update(student);
		}else if(response==2) {			
			Display.display(student);
		}
		else {
			System.out.println("Invalid entry");
		}
	}
}
