package com.tom;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Practice {

	public static void main(String[] args) {
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(88);
		numbers.add(47);
		numbers.add(88);
		System.out.println(numbers);
		
		Set<Integer> intset = new HashSet<>();
		intset.add(2);
		intset.add(87);
		intset.add(39);
		intset.add(87);
		System.out.println(intset);
	}

}
