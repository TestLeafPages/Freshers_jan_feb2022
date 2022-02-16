package week2.day3;

import java.util.Iterator;

public class ReverseEvenWords {
	public static void main(String[] args) {
    String input = "I am software tester";
	//output: I ma software retset
    String[] words = input.split(" ");
    
    for (int i = 0; i < words.length; i++) {
    	if(i % 2 == 1) {
    		
    		for (int j = words[i].length()-1; j >= 0; j--) {
				System.out.print(words[i].charAt(j));
			}
    		System.out.print(" ");
    		
    	}else {
    		System.out.print(words[i]+" ");
    	}
    	
		
	}
    
    
    
	}
}
