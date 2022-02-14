package week1.day3;

import java.util.Iterator;

public class LearnJumb {
public static void main(String[] args) {
	for (int i = 1; i <=5; i++) {
		if(i==3) {
			System.out.println("Three");
			continue;
		}
		
		System.out.println(i);
	}
}
}
