package core.java.project;

import java.util.Comparator;

public class CoffeePriceComparator implements Comparator<Coffee>{

	@Override
	public int compare(Coffee c1, Coffee c2) {
		return Integer.valueOf(c1.getPrice()).compareTo(c2.getPrice()) * -1;
	}
	
	

}
