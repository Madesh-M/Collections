package com.gqt.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Pro1 {
	public static void main(String[] args) {
		List<Integer> allLists=new ArrayList<>();
		allLists.add(10);
		allLists.add(1); // compares duplicate and write
		allLists.add(6);
		allLists.add(9);
		allLists.add(14);
		allLists.add(1,3);
		allLists.addAll(3,allLists);// adds all from 3-end again
		allLists.remove(0);
		for(Integer i:allLists) {
			if(i==11) {
				allLists.remove(i);
			}
		}
		//or
		allLists.remove((Object)11); // it removes value directly here in list we have to upcast as follows because (Object o- is parameter)
		//or
		allLists.remove((Integer)11);
		//or
		allLists.remove((1)); //it removes value in 1th position of the list( int index - is parameter).
		// same remove method but different parameters is overrloading which can be throughout parent and child class methods if same.
		
		System.out.println(allLists);
		allLists.replaceAll(x-> x%2==0? ++x: --x);
		System.out.println(allLists);
	}





}
