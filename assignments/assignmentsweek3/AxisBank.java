package assignmentsweek3;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("The deposit is 70000");
	}
	
	public static void main(String[] args) {
		AxisBank obj = new AxisBank();
		obj.deposit();
		obj.fixed();
		obj.saving();

	}

}
