package com.gqt.collection.collection;

import java.util.HashSet;
import java.util.List;

public class Pro10 {
	public static void main(String[] args) {
		HashSet<List<Integer>> allLists = new HashSet<>(); // ArrayList internally has Hashcode() equals() will compare given list and
															// remove duplicate.We can override the following.

		allLists.add(List.of(10, 5));
		allLists.add(List.of(15, 5));
		allLists.add(List.of(10, 5));
		System.out.println(allLists);
	}

}
