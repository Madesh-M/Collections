package com.gqt.collection.linkedlist;

import java.util.LinkedList;
import java.util.Queue;

public class Pro17 {
	public static void main(String[] args) {
		Queue<Integer>al=new LinkedList<>();
		al.add(10);
		al.offer(20);
		al.offer(10); //if duplicate exists it doesnt add value.
		System.out.println(al);
		al.remove();
		al.poll(); // it differs with remove by not throwing exception only returns null.
		System.out.println(al.element()); // returns first value,if empty throws exception.
		System.out.println(al.peek()); //return first value but does throw exception when it is empty
		System.out.println(al);
		al.offer(10);
		System.out.println(al);
		((LinkedList<Integer>) al).set(1, 5);// takes position and value to be added to that position removes previous value in that position and add the value specified.
		System.out.println(al);
		System.out.println(((LinkedList<Integer>)al).indexOf(10));
		System.out.println(((LinkedList<Integer>) al).lastIndexOf(10));
		System.out.println(((LinkedList<Integer>) al).lastIndexOf(5));
		
		
	}
	

}
