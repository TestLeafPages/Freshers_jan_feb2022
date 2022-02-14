package week1.day5;

public class LearnString {
public static void main(String[] args) {
	//String literal
	
			String str1="TestLeaf";
			
			char name='a';
			//Creating object
			
			String str3=new String("Welcome To testleaf");
			String str4=new String ("welcome to testleaf");
			String str2="TestLeaf";
	        System.out.println(str2);
	        //Find the length of String
	        int length = str3.length();
	        System.out.println(length);
	     // convert String to Character array
	        char[] charArray = str3.toCharArray();
	        System.out.println("the output"+charArray[length-1]);
	        
	     // get specific character
	       char charAt = str3.charAt(0);
	        System.out.println(charAt);
	        
	        System.out.println(str3.charAt(3));
	       //Check the String/char there in given input return boolen
	        System.out.println(str3.contains("Leaf"));
	     // get the index of specific String 
	       System.out.println(str3.indexOf("l"));
	       
	     // get the index of specific character
	       System.out.println(str3.indexOf('c'));
			//to split the string
	        String[] split = str4.split(" ");
	       System.out.println(split[1]);
	    // Compare the String
	    		System.out.println(str3.equals(str4));
	       //Check the string equal and ignore the case
	        System.out.println(str3.equalsIgnoreCase(str4));
	     // Validate if both String have same memory
			
	 		System.out.println(str3==str4);
	 		
	       //Change the string into LowerCase
	        System.out.println(str3.toLowerCase());
	        
	        //Change the String in UpperCase
	        System.out.println(str4.toUpperCase());

	     
}
}
