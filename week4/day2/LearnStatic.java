package week4.day2;

public class LearnStatic {

	int a=10;
	static int b=20;
	
	static {
		System.out.println("static block");
	}
	
	LearnStatic(){
		System.out.println("default constructor");
	}
	public  void print() {
		System.out.println("Print method");

	}
	public static void scan() {
		System.out.println("Scan method");

	}
	
	public void main() {
		System.out.println("overloaded main method");
	}
	public static void main(String[] args) {
		
		System.out.println(args[0]);
		
		LearnStatic learnStatic=new LearnStatic();
		System.out.println(learnStatic.a);
		System.out.println(b);
		learnStatic.print();
		scan();
		
		learnStatic.main();
	}
}
