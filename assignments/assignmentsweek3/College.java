package assignmentsweek3;

public class College extends University {
	public void ug() {
		System.out.println("UG college name");
	
	}
	public static void main(String[] args) {
		College obj = new College();
		obj.pg();
		obj.ug();
	}
}
