package com.rohan.bharath.interviewquestions.coding;

import java.util.HashSet;

public class FindNumbers {

	public static void main(String[] args) {

		System.out.println(findNumbers(new int[] { 10, 20, 5, 30, 20 }, 50));

	}

	public static boolean findNumbers(int[] arr, int find) {

		HashSet<Integer> set = new HashSet<>();

		for (int item : arr) {
			if (set.contains(find - item)) {
				return true;
			} else {
				set.add(find - item);
			}

		}

		return false;
	}

}
