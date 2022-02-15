package week2.day2;

import java.util.Arrays;
import java.util.Iterator;

public class MissingElement {
public static void main(String[] args) {
	// Here is the input
			int[] arr = {1,2,3,5,7,6,8};

			// Sort the array	
           Arrays.sort(arr);			

	// loop through the array (start i from arr[0] till the length of the array)
    for (int i = 0; i < arr.length; i++) {
    	// check if the iterator variable is not equal to the array values respectively
			//System.out.println(arr[i]);
	if(i+1!=arr[i]) {
	System.out.println(i+1);
		break;
	}
    }
				
					// print the number
					
					// once printed break the iteration
					
}
}
