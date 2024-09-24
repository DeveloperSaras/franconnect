package com.java8;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmpStreamExample {
	
	
	public static void main(String[] args) {
		
		List<Employee> eList = new ArrayList<>();
		
		eList.add(new Employee("Uzma", 40000, 21, "IT"));
		eList.add(new Employee("Tarannum", 30000, 22, "Finance"));
		eList.add(new Employee("Manjeet", 45000, 23, "HR"));
		eList.add(new Employee("Karan", 41000, 24, "HR"));
		eList.add(new Employee("Arjun", 61000, 21, "Finance"));
		eList.add(new Employee("Madhura", 55000, 23, "Finance"));
		
		
		/*
		 * eList.stream().filter(e -> e.getAge() > 21 && e.getSalary() > 40000)
		 * .collect(Collectors.toList()).forEach(System.out::println);
		 */
		
		
		List<Employee> list = eList.stream().sorted(Comparator.comparing(Employee :: getDept)
				.thenComparing(Employee :: getSalary).reversed()).collect(Collectors.toList());
		
		list.forEach(System.out :: println);
		
		
		
		
		
	}
	
	

}
