package com.gqt.collection.map;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Pro27 {
	public static void main(String[] args) {
		Map<String, Integer>m=new HashMap<>(); //replace value with recent one encountered if key value already exists mainly depends on keyvalue
		m.put("mango",100); //1
		m.put("apple",100);
		m.put("grapees",100);
		m.put("guava",100);
		m.put("mango",103); //2
		m.putIfAbsent("chikoo", 105);
		System.out.println(m);
		m.putAll(m);   // if duplicates then not included as element in collection.
		System.out.println(m);
		
		Set<Map<String,Integer>>s=new HashSet<>();
		s.add(m);
		System.out.println(m);
		Map<String, Integer>m1=new HashMap<>(m);
		m1.put("berry",102);
		//m1.addAll(Set<Map<String,Integer>> );
		System.out.println(m1);
		
	}
}
