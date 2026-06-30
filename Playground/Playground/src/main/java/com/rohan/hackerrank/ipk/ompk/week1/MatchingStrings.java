package com.rohan.hackerrank.ipk.ompk.week1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MatchingStrings {

	public static void main(String[] args) {

		List<String> strings = new ArrayList<>(Arrays.asList("ab", "ab", "abc"));
		List<String> queries = new ArrayList<>(Arrays.asList("ab", "abc", "bc"));

		List<Integer> matchingStrings = matchingStrings(strings, queries);

		matchingStrings.stream().forEach(s -> System.out.println(s));
		;

	}

	public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {

//		List<Integer> count = new ArrayList<>();
//		for(int i =0;i<queries.size();i++) {
//			int c = (int) queries.stream().map(s -> strings.contains(s)).count();
//			count.add(c);
//			
//		}
//		System.out.println(count);
//		return count;

		/*
		 * for (Iterator iterator = queries.iterator(); iterator.hasNext();) { String
		 * query = (String) iterator.next(); int count = 0; for (Iterator iterator2 =
		 * strings.iterator(); iterator2.hasNext();) { String string = (String)
		 * iterator2.next(); if ( query.equals(string)) count++; } countList.add(count);
		 * 
		 * }
		 */

		List<Integer> list = queries.stream().map(s -> Collections.frequency(strings, s)).toList();
		return list;

	}

}
