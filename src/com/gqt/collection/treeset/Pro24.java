package com.gqt.collection.treeset;

import java.util.Iterator;
import java.util.TreeSet;

public class Pro24 {
	public static void main(String[] args) {
		TreeSet<Integer>al=new TreeSet<>();
		al.add(5);
		al.add(25);
		al.add(15);
		al.add(45);
		al.add(65);
		al.add(25);
		System.out.println(al);
		//System.out.println(al.subSet(5, 25)); // same has headset.
		//System.out.println(al.headSet(15)); //excludes boundry value and print elements prior to the values.
		//System.out.println(al.tailSet(5)); // includes boundry value and print after the specified element.
		//System.out.println(al.first());
		//System.out.println(al.last());
		//System.out.println(al.lower(65));
		//System.out.println(al.floor(65));
		//System.out.println(al.ceiling(10));
		//System.out.println(al.higher(25));
		
		TreeSet<Integer>al1=(TreeSet<Integer>) al.clone();
		al1.add(50);
		System.out.println(al1.pollFirst()); //returns first element.
		System.out.println(al1.pollLast()); //returns last element.
		System.out.println(al1);
		
		
		Iterator<Integer> it=al1.iterator();
		for(;it.hasNext();){
			Integer i=it.next();
			System.out.println(i);          //iterates and prints according to the logic used usually loops are used to print elements.
		}
		Iterator<Integer> it1=al1.descendingIterator();
		for(;it1.hasNext();){
			Integer i=it1.next();
			System.out.println(i);          //iterates and prints according to the logic used usually loops are used to print elements.
		}
		System.out.println(al1.descendingIterator());
		System.out.println(al1.descendingSet());
		
		

}
}
