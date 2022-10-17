package com.gqt.collection.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;

public class Pro3 {
	public static void removeEvenNumber(Iterable<Integer>al) {
		al.forEach(x-> {
			if(x%2==0) {
				((Collection<Integer>)al).remove(x);
			}
		});
	for(Integer t:al) {
		System.out.println(t);
	}
}
	public static void main(String[] args) {
		Pro3.removeEvenNumber(new CopyOnWriteArrayList<>(Arrays.asList(10,5,8,9,6,33,46))); //exception in thread because not sychronized when we use ArrayList or HastSet
		Pro3.removeEvenNumber(new CopyOnWriteArraySet<>(Arrays.asList(11,25,63,2,5,6,8)));
	}

}
