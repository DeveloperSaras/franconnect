package core.java.project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomListSortingExample {

	public static void main(String[] args) {
		List<Coffee> coffeeList = new ArrayList<>();

		coffeeList.add(new Coffee("Cafe Latte", "Hot Coffee", "Light Brown", 200));
		coffeeList.add(new Coffee("Cappi Nirvana", "Cold Coffee", "Brown", 300));
		coffeeList.add(new Coffee("Cappuccino", "Hot Coffee", "Dark Brown", 220));
		coffeeList.add(new Coffee("Expresso", "Hot Coffee", "Black", 250));

		System.out.println("Before : " + coffeeList);

		Collections.sort(coffeeList, new CoffeeNameComparator());

		System.out.println("After sorting based on name : " + coffeeList);

		Collections.sort(coffeeList, new CoffeePriceComparator());

		System.out.println("After sorting based on price : " + coffeeList);

	}

}
