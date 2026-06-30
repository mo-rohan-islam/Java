package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.List;

public class DiagonalDifference {

	public static void main(String[] args) {

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		int i = 0, lr_sum = 0;
		int rl_sum = 0, j = arr.size() - 1;

		for (i = 0; i < arr.size(); i++) {
			lr_sum += arr.get(i).get(i);
			rl_sum += arr.get(i).get(j--);
		}

//		int sum = 0, i = 0, j = arr.size() - 1;
//		for (i = 0; i < arr.size(); i++) {
//			sum += arr.get(i).get(i) - arr.get(i).get(j--);
//		}
//		return Math.abs(sum);

		return Math.abs(lr_sum - rl_sum);

	}

}
