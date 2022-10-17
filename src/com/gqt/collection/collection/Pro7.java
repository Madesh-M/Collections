package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Pro7 {
	public static void main(String[] args) {
		Collection<Integer>al=new ArrayList<>(Arrays.asList(10,5,6,7));
		Collection<Integer>al2=new ArrayList<>();
		al2.add(15);
		al2.add(16);
		al2.add(5);
		al2.add(6);
		al2.add(7);
		System.out.println(al2.removeAll(al));// removes all values of al3 which is equal to al.
		System.out.println(al2);
		
		Collection<Integer>al3=new ArrayList<>();
		al3.add(15);
		al3.add(16);
		al3.add(10);
		al3.add(5);
		al3.add(6);
		al3.add(7);
		System.out.println(al3.retainAll(al)); //compares al3 values with al and same values will be retained and other values will be removed.
		System.out.println(al3);
		
		
	}
}
