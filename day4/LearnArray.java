package week1.day4;

public class LearnArray {
public static void main(String[] args) {
	
	int[] number= {10,20,30,40,50};
	for (int i = 0; i < number.length; i++) {
		System.out.println(number[i]);
	}
	System.out.println(number.length);
	
	System.out.println("-----------");
	System.out.println("first index"+" "+number[0]);
	System.out.println("last index"+" "+number[4]);
}
}
