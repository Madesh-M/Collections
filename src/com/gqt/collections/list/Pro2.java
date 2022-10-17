package com.gqt.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Pro2 {
	public static void main(String[] args) {
		List<Integer>allList=new ArrayList<>();
		allList.add(10);
		allList.add(1);
		allList.add(6);
		allList.add(11);
		allList.add(14);
		allList.sort((x,y)-> (x-y)); //ascending
		allList.sort((x,y)-> -(x-y)); //descending
		System.out.println(allList);
		for(int index=0;index<allList.size();index++) {
			System.out.println(allList.get(allList.size()-1-index)); //reverse the value in the list.
		}
		System.out.println (allList.indexOf(10));
		System.out.println(allList);
		System.out.println(allList.lastIndexOf(6));
		
	}

}
