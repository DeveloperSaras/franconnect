package core.java.project;

import java.util.Comparator;

public class CoffeeNameComparator implements Comparator<Coffee>{

	@Override
	public int compare(Coffee c1, Coffee c2) {
		return c1.getName().compareTo(c2.getName());
	}
	
	

}
