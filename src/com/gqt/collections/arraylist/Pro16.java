package com.gqt.collections.arraylist;

import java.util.ArrayList;
import java.util.List;

public class Pro16 {
	public static void main(String[] args) {
		ArrayList<Integer>al=new ArrayList<>(List.of(5,10,20,15));
		ArrayList<Integer>al2= al;
		ArrayList<Integer>al3=(ArrayList<Integer>) al.clone();	
		al2.add(21);
		al2.add(5);
		al3.add(25);
		System.out.println(al);
		System.out.println(al2);
		System.out.println(al3);
	}

	
	
	

	

}
