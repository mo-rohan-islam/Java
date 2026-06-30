package com.rohan.hackerrank.ipk.ompk.week1;

public class Pangrams {

	public static void main(String[] args) {
		System.out.println(Pangrams.pangrams("We promptly judged antique ivory buckles for the next prize"));
	}

	public static String pangrams(String s) {

//		s = s.toLowerCase();
//		for (int i = 97; i <= 122; i++) {
//			String c = String.valueOf((char) i);
//			if (!s.contains(c)) {
//				return "not pangram";
//			}
//		}
//
//		return "pangram";

		return s.toLowerCase().chars().distinct().count() == 27 ? "pangram" : "not pangram";

	}

}
