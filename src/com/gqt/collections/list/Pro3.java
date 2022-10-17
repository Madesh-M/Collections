package com.gqt.collections.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Pro3 {
	public static void main(String[] args) {
		List<Integer>allList=new ArrayList<>();
		allList.add(10);
		allList.add(1);
		allList.add(6);
		allList.add(11);
		allList.add(14);
		
		ListIterator<Integer> lite=allList.listIterator();
		fwd:for(;lite.hasNext();) {
			Integer i=lite.next();
			if(i%3==0) break;
		}
		rev:for(;lite.hasPrevious();) {
			Integer i=lite.previous();
			System.out.println(i);
		}
		addIterator:for(;lite.hasNext();) {
			if(lite.next()%2==1) {
				lite.add(1000);
			}
		}
		System.out.println(allList);
		

}
}