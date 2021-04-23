package Default;

public class Display {

	public static void display(Student student) {
		
		System.out.println("ID:" + student.getId());
		System.out.println("Name:" + student.getName());
		System.out.println("Contact:" + student.getPhone());
		System.out.println("Email:" + student.getEmail());
		System.out.println("Department:" + student.getDepartment());
	}
}
