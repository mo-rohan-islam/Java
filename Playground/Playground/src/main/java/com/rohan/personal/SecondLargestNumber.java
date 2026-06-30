package com.rohan.personal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class SecondLargestNumber {

	public static void main(String[] args) {

		List<Integer> input = new ArrayList<>(Arrays.asList(1, 23, 345, 12, 56, 100, 201, 158));

		// input.stream().filter(i -> Integer.toString(i).charAt(0) == '1').forEach(i -> System.out.println(i));		// prints numbers starting with 1

		System.out.println("Second Largest Number: " + SecondLargestNumber.secondLargest(input));
		

		Integer secondLargestNumber = input.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
		System.out.println(secondLargestNumber);

	}

	static int secondLargest(List<Integer> list) {

		int max = 0, second = 0;
		for (int item : list) {

			if (max < item) {
				second = max;
				max = item;
			} else if (second < item) {
				second = item;
			}

		}

		return second;

	}

}
