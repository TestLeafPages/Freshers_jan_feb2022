package week1.day4;

import java.util.Arrays;

public class AcendingOrder {
public static void main(String[] args) {
	int[] value= {3,5,6,2,1,4};
	
	Arrays.sort(value);
	for (int i = value.length-1; i >=0; i--) {
		System.out.println(value[i]);
	}
}
}
