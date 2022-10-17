package com.gqt.collection.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class Pro9 {
	public static void main(String[] args) {
		Collection<Integer> allv = new ArrayList<>(List.of(10, 5, 6, 10, 5, 16, 17));
		allv.stream().distinct().forEach(x -> System.out.println(x));
		Optional<Integer> m = allv.stream().distinct().findAny();
		Optional<Integer> m1 = allv.parallelStream().distinct().findAny();
		System.out.println(m.get());
		System.out.println(m1.get());
	}

}
