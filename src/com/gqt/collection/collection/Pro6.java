package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Pro6 {
	public static void main(String[] args) {
		Collection<Integer>al=new ArrayList<>(Arrays.asList(10,5,6,7));
		Collection<Integer>al2=new ArrayList<>();
		al2.add(15);
		al2.add(16);
		al2.addAll(al);
		System.out.println(al2.containsAll(al)); //Boolean
		System.out.println(al.containsAll(al2)); //Boolean
		al.removeIf(x-> x%5==0);
		System.out.println(al);
	}

}
