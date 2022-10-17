package com.gqt.collection.linkedlist;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Pro18 {
	public static void main(String[] args) {
		Deque<Integer>al=new LinkedList<>(List.of(10,5,20));
		al.addFirst(2);
		al.addLast(6);
		al.offerFirst(8);
		al.offerLast(7);
		System.out.println(al);
		al.removeFirst();
		al.removeLast();
		al.add(10);
		System.out.println(al);
		al.removeFirstOccurrence(al);
		al.removeLastOccurrence(al);
		System.out.println(al);
		al.pollFirst();
		al.pollLast();
		al.peekFirst();
		al.peekLast();
		al.getFirst();
		al.getLast();
		System.out.println(al);
		al.push(5);
		al.push(15);
		al.pop();
		System.out.println(al);
		
		
		

}
}
