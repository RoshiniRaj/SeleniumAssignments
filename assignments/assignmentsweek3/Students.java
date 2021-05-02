package assignmentsweek3;

public class Students {
	public void getStudentInfo(int id) {
		System.out.println("The student Id: ");
		
	}
	public void getStudentInfo(int id, String name) {
		System.out.println("The student Id + student name" + " ");
		
	}
	public void getStudentInfo(String email, long phoneNumber) {
		System.out.println("The student email + student phone number" + " ");
	}
	public static void main(String[] args) {
		Students std = new Students();
		std.getStudentInfo(100);
		std.getStudentInfo(100, "rose");
		std.getStudentInfo("abc@gmail.com", 987654210);
	}
		

	}


