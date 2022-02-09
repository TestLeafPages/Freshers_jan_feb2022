package week1.day3;

import java.util.Iterator;

public class PrimeNumber {
public static void main(String[] args) {
	int num=13;

	int count=0;
	for (int i = 1; i <=num; i++) {
		if(num%i==0) {
			
			count++;
		}
		
	}
	if(count== 2) {
		System.out.println("Given number is Prime Number");
	}else {
		System.out.println("Given number is not Prime Number");
	}
}
}
