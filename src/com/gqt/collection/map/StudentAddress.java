package com.gqt.collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class StudentAddress {
	public static void main(String[] args) {
		Address address1=new Address(23, "1B", "Vivekanandha", "banglore");
		Address address2=new Address(21, 560085, "2B", "Srinivasanagar", "banglore");
		
		Student s1=new Student(1001, "Madesh");
		Student s2=new Student(1002, "Manjesh", address2);
		Student s3=new Student(1001, "Mahesh");
		
		Map<Student, Address>allstudadda=new HashMap<>();
		allstudadda.put(s1, address1);
		allstudadda.put(s2, address2);
		allstudadda.put(s3, address2);
		
		Address sfirst=allstudadda.get(s1);
		System.out.println(sfirst);
		allstudadda.keySet().forEach(x-> System.out.println(x));
		
		TreeMap<Student, Address>tm=new TreeMap<>((x,y)->x.id-y.id);
		tm.putAll(allstudadda);
		System.out.println(tm);
		
		TreeMap<Student, Address>tm1=new TreeMap<>((x,y)->x.address.pin-y.address.pin);
		System.out.println(tm1);
		
		
		
		
	}

}
