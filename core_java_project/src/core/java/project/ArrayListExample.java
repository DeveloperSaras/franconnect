package core.java.project;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(104);
		
		System.out.println(list.get(3));
		
		//enhanced for loop/ for-each loop
		for(int n : list) {
			System.out.println("Value = " + n*5);
		}
		
		Iterator<Integer> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	}

}
