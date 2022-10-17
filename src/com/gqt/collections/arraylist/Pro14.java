package com.gqt.collections.arraylist;

import java.util.ArrayList;
import java.util.Set;

public class Pro14 {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>();
		ArrayList<Integer>al1=new ArrayList<>(500);
		ArrayList<Integer>al2=new ArrayList<>(Set.of(10,2,15,14));
		
		al.add(10);
		al.add(1);
		al.add(6);
		al.add(11);
		al.add(14);
		al.trimToSize();
		al.ensureCapacity(10);
		System.out.println(al);
		System.out.println(al1);
		System.out.println(al2);

}
}