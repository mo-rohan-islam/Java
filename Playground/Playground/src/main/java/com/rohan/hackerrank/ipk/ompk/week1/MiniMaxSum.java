package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MiniMaxSum {

	public static void main(String[] args) {

//		List<Long> list = new ArrayList<>();
//	    
//	    Optional<Long> min = list.stream().min(Long::compareTo);
//	    Optional<Long> max = list.stream().max(Long::compareTo);

//		int[] arr = {1,2,3,4,5};
		List<Integer> arr = new ArrayList<>(Arrays.asList(5, 2, 1, 3, 4));

//	    Optional<Integer> min = arr.stream().min(Integer::compareTo);
//	    Optional<Integer> max = arr.stream().max(Integer::compareTo);
//	    
//	    int minSum = 0, maxSum = 0;
//	    arr.stream().

		/*
		 * 
		 * Working Code below
		 * 
		 * sum all numbers n times, store the result and compare the result to get the
		 * min and max results
		 * 
		 */

//		List<Integer> sumList = new ArrayList<>();
//		for (Iterator iterator = arr.iterator(); iterator.hasNext();) {
//			Integer integer = (Integer) iterator.next();
//			int sum = 0;
//			for (Iterator iterator2 = arr.iterator(); iterator2.hasNext();) {
//				Integer integer2 = (Integer) iterator2.next();
//				if (integer == integer2)
//					continue;
//				sum += integer2;
//			}
//			sumList.add(sum);
//			
//		}
//		System.out.println(sumList);
//		
//		Optional<Integer> min = sumList.stream().min(Integer::compareTo);
//		Optional<Integer> max = sumList.stream().max(Integer::compareTo);
//		
//		System.out.println(min.get());
//		System.out.println(max.get());

		arr.sort(Integer::compareTo);
		System.out.println(arr);

		Integer min = arr.get(0);
		Integer max = arr.get(arr.size() - 1);

		int minSum = 0, maxSum = 0;
		for (Integer integer : arr) {
			if (integer != max)
				minSum += integer;
			if (integer != min)
				maxSum += integer;
		}

		System.out.println(minSum + " " + maxSum);

		arr.sort(Integer::compareTo);
		// System.out.println(arr);

		/*
		 * 
		 * int min = arr.get(0); int max = arr.get(arr.size() - 1);
		 * 
		 * long minSum = 0, maxSum = 0, sum = 0;
		 * 
		 * for (Integer item : arr) { sum += item; }
		 * 
		 * minSum = sum - max; maxSum = sum - min;
		 * 
		 * System.out.println(minSum + " " + maxSum);
		 * 
		 */
	}

}
