package com.gqt.collection.set;

import java.util.HashSet;
import java.util.Set;


public class Pro21 {
	public static void main(String[] args) {
		Set<Integer>al=new HashSet<>(); //no duplicates and Random Order use Linkedhashset for order we want.
		al.add(5);
		al.add(10);
		al.add(15);
		al.add(45);
		al.add(65);
		al.add(25);
		System.out.println(al);
		
	}

}
