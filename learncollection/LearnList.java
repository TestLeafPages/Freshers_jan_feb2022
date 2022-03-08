package learncollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class LearnList {
public static void main(String[] args) {
	List<String> name=new LinkedList<String>();
	name.add("Anup");
	name.add("Mani");
	name.add("Ajeesh");
	name.add("Kavin");
	name.add("Nithish");
	
	
	
	
	
	System.out.println(name.size());
	name.add("Muthu");
	System.out.println(name.size());
	name.add(0, "Ajith");
	
	name.remove("Anup");
	
	System.out.println(name.contains("Kavin"));
	//name.clear();
	System.out.println(name.isEmpty());
	//System.out.println(name.get(name.size()-2));
	System.out.println(name);
	
	Collections.sort(name);
	System.out.println(name);
	
	Collections.reverse(name);
	System.out.println(name);
	System.out.println(name.get(2));
	
}
}
