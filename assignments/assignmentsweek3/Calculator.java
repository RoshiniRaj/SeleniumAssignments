package assignmentsweek3;

public class Calculator {
	public void add (int a, int b){
		System.out.println(a + b);
		}
	public void add (int a, int b, int c) {
		System.out.println(a + b);
		}
	public void multiply (int a, int b) {
		System.out.println(a * b);
		}
	public void multiply (int a, double b) {
		System.out.println(a * b);
		}
	public void subtract (int a, int b) {
		System.out.println(a - b);
		}
	public void subtract (double a, double b) {
		System.out.println(a - b);
		}
	public void divide (int a, int b) {
		System.out.println(a/b);
		}
	public void divide (double a, double b) {
		System.out.println(a/b);
		}
	public static void main(String[] args) {
		Calculator obj = new Calculator();
		obj.add(1, 2);
		obj.add(1, 2, 3);
		obj.multiply(3, 4);
		obj.multiply(6, 6.0);
		obj.divide(3, 3);
		obj.divide(30, 3);
		obj.subtract(5, 3);
		obj.subtract(7.2, 5.1);
		
	}
	
	
	}

