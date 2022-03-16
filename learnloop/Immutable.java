package learnloop;

public class Immutable {
public static void main(String[] args) {
	String str1="Apple";
	str1="orange";
	System.out.println(str1); 
	String str2="Apple";
	//System.out.println(str2); 
	String str="TestLeaf";
	char[] charArray = str.toCharArray();
	for (int i = charArray.length-1; i >=0; i--) {
		System.out.print(charArray[i]);
	}
	System.out.println("----------------------");
	StringBuffer obj=new StringBuffer("Apple");
	StringBuffer reverse = obj.reverse();
	
	System.out.println(reverse);
	
	StringBuilder obj2=new StringBuilder("orange");
	StringBuilder reverse2 = obj2.reverse();

	System.out.println(reverse2);
	System.out.println("---------------");
	StringBuilder obj3=new StringBuilder("Test");
	StringBuilder append = obj3.append("Leaf");
	System.out.println(append);
}
}
