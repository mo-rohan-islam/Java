package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CountingSort {

	public static void main(String[] args) {

		System.out.println(CountingSort.countingSort(Arrays.asList(1, 1, 2, 3, 1)));

	}

	public static List<Integer> countingSort(List<Integer> arr) {

		List<Integer> result = new ArrayList<Integer>();

		for (int i = 0; i < 100; i++) {
			result.add(0);
		}

		// use while size < 100

		for (int i = 0; i < arr.size(); i++) {
			int value = arr.get(i);
			result.set(value, result.get(value) + 1);
		}

		// use foreach

		return result;

	}

}
