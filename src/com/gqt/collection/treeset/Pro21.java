package com.gqt.collection.treeset;

import java.util.PriorityQueue;
import java.util.TreeSet;

public class Pro21 {
	public static void main(String[] args) {
		TreeSet<Integer>al=new TreeSet<>((x,y)-> y-x); // wont take duplicate values as in 1 and 2.
		al.add(10);                         // takes value and arrange them in ascending order.
		al.add(15); //1
		al.add(35);
		al.add(25);
		al.add(15); //2
		al.add(5);
		al.remove(10);
		al.addAll(al);
		System.out.println(al);
		
		PriorityQueue<Integer>pq=new PriorityQueue<>(al); //takes value and arrange them in ascending order.
		System.out.println(pq);
	}

}
