package com.sks.collection;

public class EnumExample {
	
	private enum fruits {APPLE, PINEAPPLE, COCONUT, BANANA, GRAPES};
	
	public static void main(String[] args) {
		
		System.out.println(fruits.COCONUT);
		
		fruits [] fruitArr = fruits.values();
		
		for(fruits f : fruitArr) {
			System.out.println(f);
		}
		System.out.println("_________________________________");
		
		System.out.println(IndianStates.WB.displayDesc());
		
	}

}
