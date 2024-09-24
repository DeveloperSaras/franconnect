package com.java8;

import java.util.ArrayList;
import java.util.List;

public class ListWithLambda {
	
	
	public static void main(String[] args) {
		
		List<Integer> list = new ArrayList<>();
		
		list.add(101);
		list.add(102);
		list.add(103);
		list.add(101);
		list.add(104);
		
		for(int val : list) {
			System.out.println(val);
		}
		
		System.out.println("_______________________");
		
		list.forEach(e -> System.out.println(e));
		
	}
}