package week2.day2;

import java.util.Iterator;

public class PrintDuplicate {
public static void main(String[] args) {
	int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
	
for (int i = 0; i < arr.length; i++) {
	//int count=1;
	for (int j = i+1; j < arr.length; j++) {
		if(arr[i]==arr[j]) {
			//count++;
			System.out.println(arr[i]);
	}
	}
//}if(count>1) {
//	System.out.println(arr[i]);
}
	
}
}
