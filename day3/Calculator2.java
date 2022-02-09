package week1.day3;

public class Calculator2 {
	public void addTwoNumber(int a,int b) {
		  int c=a+b;
		System.out.println(c);
	}
	public static void main(String[] args) {
		Calculator2 val=new Calculator2();
		val.addTwoNumber(10,10);
		val.addTwoNumber(20,40);
		val.addTwoNumber(50,50);
		val.addTwoNumber(60,60);
	}
}
