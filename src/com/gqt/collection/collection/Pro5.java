package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Collection;

public class Pro5 {
	public static void main(String[] args) {
		Collection<Integer>al=new ArrayList<>();
		System.out.println(al.isEmpty());//Boolean 
		System.out.println(al.size());
		al.add(10);
		al.add(5);
		al.add(8);
		al.addAll(al);
		System.out.println(al);
		Collection<Integer> al1=al;
		System.out.println(al.size());
		System.out.println(al1);
		System.out.println(al.contains(10));
		System.out.println(); 
		System.out.println(al);// deletes the values in entire collection
	}

}
