package week1.day3;

public class Factorial {

	public static void main(String[] args) {
		int input=5;
		int fact=1;
		//5*4*3*2*1
		
		for (int i = input; i>=1; i--) {
			fact=fact*i;
			
			
		}
		System.out.println(fact);
	}
	
	
}
