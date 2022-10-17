package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

public class Pro4 {
	public static void checkSize(Iterable<Integer>al) {
		System.out.println(((Collection<Integer>)al).size()); 
	}
	public static void main(String[] args) {
		Pro4.checkSize(new ArrayList<>(Arrays.asList(10,20,30)));
		Pro4.checkSize(new HashSet<>(Arrays.asList(10)));
	}
}
