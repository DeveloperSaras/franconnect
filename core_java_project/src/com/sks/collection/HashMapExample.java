package com.sks.collection;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {
	
	
	public static void main(String[] args) {
		
		Map<Integer, String> map = new HashMap<>();
		
		map.put(101, "Darwin");
		map.put(102, "Newton");
		map.put(103, "Kalam");
		map.put(104, "Einstein");
		map.put(105, "Tesla");
		
		map.put(104, "CV Raman");
		
		System.out.println(map.get(103));
		
		System.out.println(map.containsValue("Ansh"));
		
		Set<Entry<Integer, String>> setViewOfMap   = map.entrySet();
		
		Iterator<Entry<Integer, String>> it = setViewOfMap.iterator();
		
		while(it.hasNext()) {
			Entry<Integer, String> entry = it.next();
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		Set<Integer> keySet = map.keySet();
		
		for(int key : keySet) {
			System.out.println(key + " : " + map.get(key));
		}
		
		
	}

}
