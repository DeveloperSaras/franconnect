package core.java.project;

import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> names = new TreeSet<>();
		
		names.add("Arjun");
		names.add("David");
		names.add("Ansh");
		names.add("Himanshu");
		names.add("Mohit");
		names.add("Mohit");
		names.add("Ansh");
		
		for(String name : names) {
			System.out.println(name);
		}
		
		System.out.println(names);
		
		
		
		
	}
	
}
