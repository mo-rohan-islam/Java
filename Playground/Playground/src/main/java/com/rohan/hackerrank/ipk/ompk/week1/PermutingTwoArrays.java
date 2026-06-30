package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.List;

public class PermutingTwoArrays {

	public static void main(String[] args) {

//		PermutingTwoArrays.twoArrays(10, Arrays.asList(null), null);

	}

	public static String twoArrays(int k, List<Integer> A, List<Integer> B) {

		A.sort((n1, n2) -> n1.compareTo(n2));
		B.sort((n1, n2) -> n2.compareTo(n1));

		// System.out.println(A);
		// System.out.println(B);

		for (int i = 0; i < A.size(); i++) {
			int sumOfDigits = A.get(i) + B.get(i);
			if (sumOfDigits < k) {
				return "NO";
			}
			System.out.println(sumOfDigits);
		}

		return "YES";

	}

}
