package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Pro8 {
public static void main(String[] args) {
	Collection<Integer>allv=new ArrayList<>(List.of(10,5,6,17,12));
	Object[] o=allv.toArray();
	for(Object t:o) {
		System.out.println(t);
	}
	Integer[] i=new Integer[allv.size()];
	Integer[] na=allv.toArray(i);
	System.out.println(Arrays.deepToString(na));
	System.out.println(Arrays.deepToString(i));
	Integer[] na1=allv.toArray(new Integer[0]);
	System.out.println(Arrays.deepToString(na1));
}
}
