package com.gqt.collection.map;

import java.util.HashMap;
import java.util.Map;

public class Pro26 {
	public static void main(String[] args) {
		Map<String, Integer>m=new HashMap<>(); //replace value with recent one encountered if key value already exists mainly depends on keyvalue
		m.put("mango",100); //1
		m.put("apple",100);
		m.put("grapees",100);
		m.put("guava",100);
		m.put("mango",103); //2
		m.putIfAbsent("chikoo", 105);
		System.out.println(m);
		Integer value=m.get("mango");
		System.out.println(value);
		System.out.println(m.keySet());
		System.out.println(m.values());
		System.out.println(m.entrySet());
		m.forEach((x,y)-> System.out.println(x+" "+y));
		m.keySet().forEach(x-> System.out.println(x+" "+m.get(x)));
		for(Map.Entry<String, Integer> f:m.entrySet()) {
			System.out.println(f.getKey());
			System.out.println(f.getValue());
			
		}
	}

}
