package com.gqt.collection.sortedset;

import java.util.SortedSet;
import java.util.TreeSet;

public class Pro23 {
	public static void main(String[] args) {
		SortedSet<Integer>al=new TreeSet<>();
		al.add(5);
		al.add(25);
		al.add(15);
		al.add(45);
		al.add(65);
		al.add(25);
		System.out.println(al);
		System.out.println(al.subSet(5, 25)); // same has headset.
		System.out.println(al.headSet(15)); //excludes boundry value and print elements prior to the values.
		System.out.println(al.tailSet(5)); // includes boundry value and print after the specified element.
		System.out.println(al.first());
		System.out.println(al.last());
	}

}
