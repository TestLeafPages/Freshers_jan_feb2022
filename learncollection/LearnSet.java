package learncollection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {
	public static void main(String[] args) {
		Set<String> company=new TreeSet<String>();
		company.add("Qeagle");
		company.add("Test Leaf");
		boolean add = company.add("Tcs");
		System.out.println(add);
		company.add("Wipro");
		company.add("Hcl");
		
		boolean add2 = company.add("Tcs");
		System.out.println(add2);
		System.out.println(company);
		System.out.println(company.size());
		//Collections.reverse(company);
		
		List<String> val=new ArrayList<String>(company);
		System.out.println(val);
		System.out.println(val.get(0));
	}

}
