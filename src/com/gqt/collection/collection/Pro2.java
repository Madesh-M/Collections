package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


public class Pro2 {
	public static void main(String[] args) {
		Iterable<Integer> al=new ArrayList<>();
		((Collection<Integer>) al).add(10); //Rtp
		((List<Integer>) al).add(20);  //Rtp
		((ArrayList<Integer>) al).add(30);  //Ctp
		al.forEach(x -> System.out.println(x) );
		
	}

}
