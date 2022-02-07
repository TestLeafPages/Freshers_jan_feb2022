package week1.day1;

public class Calculator {
	public void addTwoNumber() {
		System.out.println("Addition");
	}
	public void subTwoNumber() {
		System.out.println("Subraction");
	}
	public void mulTwoNumber() {
		System.out.println("Multiplication");
	}
	public void divideTwoNumber() {
		System.out.println("Division");
	}
public static void main(String[] args) {
	Calculator calc=new Calculator();
	calc.addTwoNumber();
	calc.subTwoNumber();
	calc.mulTwoNumber();
	calc.divideTwoNumber();
}
}
