package com.gqt.collection.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class Pro22 {
	public static void main(String[] args) {
		Set<Integer>al=new LinkedHashSet<>(); //no duplicates but it will be in order of we assign.
		al.add(5);
		al.add(25);
		al.add(15);
		al.add(45);
		al.add(65);
		al.add(25);
		System.out.println(al);

}
}
