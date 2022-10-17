package com.gqt.collection.navigableset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class Pro25 {
	public static void main(String[] args) {
		NavigableSet<Integer>al=new TreeSet<>();
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
		System.out.println(al.subSet(5, true, 25, true));
		System.out.println(al.headSet(15, true));
		System.out.println(al.tailSet(5, true));
		System.out.println(al.first());
		System.out.println(al.last());
		System.out.println(al.lower(65));  //lower value than value specified
		System.out.println(al.floor(65));  //same or lower value than specified value
		System.out.println(al.ceiling(10)); //same or next higher
		System.out.println(al.higher(25)); // next higher
		
		NavigableSet<Integer>al1=al.descendingSet();
		System.out.println(al1);

}}
