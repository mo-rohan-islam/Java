package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LonelyInteger {

	public static void main(String[] args) {
		Stream.of("one", "two", "three", "four").filter(e -> e.length() > 3)
				.peek(e -> System.out.println("Filtered value: " + e)).map(String::toUpperCase)
				.peek(e -> System.out.println("Mapped value: " + e)).collect(Collectors.toList());

		List<Integer> a = new ArrayList<>(Arrays.asList(1, 2, 0, 1, 0));
		Stream<Integer> filter = a.stream().filter(i -> Collections.frequency(a, i) == 1);
		System.out.println(filter.iterator().next());

	}

	public static int lonelyinteger(List<Integer> a) {

		a.stream().filter(i -> Collections.frequency(a, i) == 1);

		return 0;

	}

}
