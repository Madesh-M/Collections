package com.gqt.collections.arraylist;

import java.util.ArrayList;

public class RemoveRange extends ArrayList<Integer> {
	public static void main(String[] args) {
		RemoveRange rr= new RemoveRange();
		rr.add(4);
		rr.add(5);
		rr.add(10);
		rr.add(12);
		rr.add(1);
		System.out.println(rr);
		rr.removeRange(2, 4);
		System.out.println(rr);
		
	}
	

}
