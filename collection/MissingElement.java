package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class MissingElement {
public static void main(String[] args) {
	int[] numbers = {4,5,7,2,3,1,9,10,8,8};
	
	// 1) Remove the duplicates using Set
	Set<Integer> uniqueNumbers = new TreeSet<Integer>();
	for (int i = 0; i < numbers.length; i++) {
		uniqueNumbers.add(numbers[i]);
	}
	
	// 2) Convert Set to List 
	List<Integer> allNumbers = new ArrayList<Integer>(uniqueNumbers);
	for (int i = 1; i <= allNumbers.size(); i++) {
		if(i != allNumbers.get(i-1)) {
			System.out.println(i);
			break;
		}
		
}
}
}