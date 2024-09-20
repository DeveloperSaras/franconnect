package core.java.project;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		LinkedList<String> names = new LinkedList<>();
		
		names.add("Meera");
		names.add("Kabir");
		names.add("Raskhan");
		
		names.addFirst("Arjun");
		names.addLast("Surdas");
		
		names.add("Kabir");
		
		System.out.println("Before sorting ___________________");
		System.out.println(names);
		
		Collections.sort(names);
		
		System.out.println("After sorting ___________________");
		System.out.println(names);
		
		
		
		
		
	}

}
